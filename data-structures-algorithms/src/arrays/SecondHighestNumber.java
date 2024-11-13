package arrays;

public class SecondHighestNumber {

  public static void main(String[] args) {

    int[] arr = {4,2,6,8,3,10,7,12};

    int secondHighest = secondHighest(arr);
    System.out.println(secondHighest);
  }

  static int secondHighest(int[] arr) {

    if(arr.length == 0 || arr.length == 1) return -1;

    int highest = arr[0];
    int secondHighest = Integer.MIN_VALUE;

    for(int i=1; i<arr.length; i++) {
      if(arr[i] > highest) {
        secondHighest = highest;
        highest = arr[i];
      } else if(arr[i] > secondHighest) {
        secondHighest = arr[i];
      }
    }
    System.out.println("highest:" + highest);
    return secondHighest;
  }
}
