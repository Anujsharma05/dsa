package arrays;

public class FindNumber {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		int valueToSearch = 6;
		
		int index = searchInArray(intArray, valueToSearch);
		System.out.println(index);
	}

	public static int searchInArray(int[] intArray, int valueToSearch) {
		
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] == valueToSearch) {
				return i;
			}
		}
		return -1;
    }
	
//	public static int searchInArray(int[] intArray, int valueToSearch) {
//		
//		Arrays.sort(intArray);
//		
//		return binarySearch(intArray, valueToSearch, 0, intArray.length-1);
//    }
//
//	private static int binarySearch(int[] intArray, int value, int low, int high) {
//		
//		int mid = (low+high)/2;
//		
//		if(low>high) return -1;
//		
//		if(intArray[mid] == value) {
//			return mid;
//		}else if(intArray[mid] < value) {
//			return binarySearch(intArray, value, mid+1, high);
//		} else {
//			return binarySearch(intArray, value, low, mid-1);
//		}
//	}
}
