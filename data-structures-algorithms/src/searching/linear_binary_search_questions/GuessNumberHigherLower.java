package searching.linear_binary_search_questions;

class GuessGame {

    int pickedNumber;
    public int guess(int num) {
        if(num < pickedNumber) {
            return 1;
        } else if(num > pickedNumber) {
            return -1;
        } else {
            return 0;
        }
    }
}
public class GuessNumberHigherLower extends GuessGame {
    public GuessNumberHigherLower(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    public static void main(String[] args) {

        int num = 200;
        int pickedNumber = 18;

        GuessNumberHigherLower obj = new GuessNumberHigherLower(pickedNumber);

        int ans = obj.guessNumber(num);
        System.out.println(ans);
    }

    public int guessNumber(int n) {

       int low = 1;
       int high = n;

       while(low <= high) {
           int mid = low + (high - low)/2;
           if(guess(mid) == -1) {
               high = mid - 1;
           } else if(guess(mid) == 1) {
               low = mid + 1;
           } else {
               return mid;
           }
       }
       return -1;
    }
}
