package searching.linear_binary_search_questions;

class VersionControl {
    public boolean isBadVersion(int n) {
         if(n >= 4) {
             return true;
         }
         return false;
    }
}

public class FirstBadVersion extends VersionControl {
    public static void main(String[] args) {
        FirstBadVersion obj = new FirstBadVersion();
        int firstBadVersion = obj.firstBadVersion(15);
        System.out.println(firstBadVersion);
    }
    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
