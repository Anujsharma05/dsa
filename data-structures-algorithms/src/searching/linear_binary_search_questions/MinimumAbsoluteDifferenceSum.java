package searching.linear_binary_search_questions;

public class MinimumAbsoluteDifferenceSum {
    public static void main(String[] args) {
        int[] nums1 = {2,};
        int[] nums2 = {4};

        int sumDiff = minAbsoluteSumDiff(nums1, nums2);
        System.out.println(sumDiff);
    }
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

        int maxDifference = Math.abs(nums1[0] - nums2[0]);
        int maxDiffIndex = 0;
        for(int i=1; i<nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if(diff > maxDifference) {
                maxDifference = diff;
                maxDiffIndex = i;
            }
        }

        int minDiff = Math.abs(nums1[0] - nums2[maxDiffIndex]);
        int minDiffIndex = 0;
        for(int i=1; i<nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[maxDiffIndex]);
            if(diff < minDiff) {
                minDiff = diff;
                minDiffIndex = i;
            }
        }

        nums1[maxDiffIndex] = nums1[minDiffIndex];

        int M = 1000000007;
        int sum = 0;
        for(int i=0; i<nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = sum%M + diff%M;
        }
        return sum;
    }
}
