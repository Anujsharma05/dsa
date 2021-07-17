package recursion;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {4, 3, 2, 8, 1, 1};
		int n = arr.length;
		
//		int[] output = sort(arr, 0, n-1);
//		for(int a: output) {
//			System.err.print(a + " ");
//		}
		fun1(5);
		int x = 4;
		func(--x);
	}
	
	static void func(int x) {
		System.err.println(x);
	}
	static void fun1(int n)
	{
	   int i = 0;  
	   if (n > 1)
	     fun1(n - 1);
	   for (i = 0; i < n; i++)
	     System.out.print(" * ");
	}
	private static int findMinIndex(int arr[], int startIndex, int endIndex) {
		
		int smallestValue = Integer.MAX_VALUE;
		int index = startIndex;
		
		for(int i=startIndex; i<=endIndex; i++) {
			if(smallestValue > arr[i]) {
				smallestValue = arr[i];
				index = i;
			}
		}
		
		return index;
	}
	
	private static int[] sort(int[] arr, int startIndex, int endIndex) {
		
		if(startIndex>endIndex) {
			return arr;
		}
		
		int minIndex = findMinIndex(arr, startIndex, endIndex);
		
		//swap
		int temp = arr[startIndex];
		arr[startIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		return sort(arr, startIndex+1, endIndex);
	}
}
