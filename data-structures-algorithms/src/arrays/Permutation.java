package arrays;

public class Permutation {

	public static void main(String[] args) {
		
		int[] array1 = {0, 0, 5, 3,2};
		int[] array2 = {10, 0,0,0,0};
		
		boolean output = permutation(array1, array2);
		System.out.println(output);
	}

	public static boolean permutation(int[] array1, int[] array2){
		
//		for integer arrays, if sum and product of all the elements in first array is equal to sum and product of elements in second array, then they are permutation of each other
		
		int sum1=0, prod1=1;
		int sum2=0, prod2=1;
		
		for(int i=0; i<array1.length; i++) {
			sum1 = sum1 + array1[i];
			prod1 = prod1 * array1[i];
			sum2 = sum2 + array2[i];
			prod2 = prod2 * array2[i];
		}
		
		if(sum1 == sum2 && prod1 == prod2)
			return true;
		else
			return false;
		
//		O(n)
//		if(array1.length != array2.length) return false;
//		
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		for(int i=0; i<array1.length; i++) {
//			if(map.containsKey(array1[i])) {
//				map.put(array1[i], map.get(array1[i])+1);
//			} else {
//				map.put(array1[i], 1);
//			}
//		}
//		
//		for(int i=0; i<array2.length; i++) {
//			if(map.containsKey(array2[i])) {
//				map.put(array2[i], map.get(array2[i])-1);
//			} else {
//				return false;
//			}
//		}
//		
//		for(Integer i: map.values()) {
//			if(i != 0) return false;
//		}
//		
//		return true;
		
//      O(nlogn)
//		if(array1.length != array2.length) {
//			return false;
//		}
//		
//		Arrays.sort(array1);
//		Arrays.sort(array2);
//		
//		for(int i=0; i<array1.length; i++) {
//			if(array1[i] != array2[i]) {
//				return false;
//			}
//		}
//		
//		return true;
		
		
//		O(n^2)
//		if(array1.length != array2.length) {
//			return false;
//		}
//		
//		boolean[] visited = new boolean[array2.length];
//		
//		for(int i=0; i<array1.length; i++) {
//			boolean found = false;
//			for(int j=0; j<array2.length; j++) {
//				if(array1[i] == array2[j] && !visited[j]) {
//					visited[j] = true;
//					found = true;
//					break;
//				}
//			}
//			
//			if(!found) return false;
//		}
//		return true;
    }
}
