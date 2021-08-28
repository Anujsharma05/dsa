package searching.binary_search_questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'j';

        char ceiling = nextGreatestLetter(arr, target);
        System.out.println(ceiling);
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[end]) {
            return letters[start];
        }

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start];
    }
}
