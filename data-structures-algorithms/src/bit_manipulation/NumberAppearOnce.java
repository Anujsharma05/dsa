package bit_manipulation;

//all num appear twice except one, find that num
public class NumberAppearOnce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,5,2,3,4, 5, 9};
        int numOnce = findNumOnce(arr);
        System.out.println(numOnce);
    }

    static int findNumOnce(int[] arr) {
        int temp = 0;
        for(int i: arr) {
            temp = i ^ temp;
        }

        return temp;
    }
}
