package problems.leetcode.medium;

public class MatrixSearch {

	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		boolean result = searchMatrix(matrix, 33);
		System.err.println(result);
	}
	
//	log(m) + log(n)
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
		int row = matrix.length;
		if(row < 1) {
			return false;
		}
		int col = matrix[0].length;
		
//		O(m)
//		int desiredRow = 0;
//		for(int i=row-1; i>0; i--) {
//			if(matrix[i][col-1] == target) {
//				return true;
//			}
//			if(matrix[i-1][col-1] < target && target < matrix[i][col-1]) {
//				desiredRow = i;
//				break;
//			}
//		}
		
//		log(m)
		int l=0, h=row-1;
		
		while(l < h) {
			int mid = (l+h)/2;
			
			if(matrix[mid][col-1] == target) return true;
			else if(matrix[mid][col-1] > target) {
				h = mid;
			} else {
				l = mid + 1;
			}
		}
		return searchingThroughColumn(matrix, h, target);
    }
	
//	log(n)
	private static boolean searchingThroughColumn(int[][] matrix, int desiredRow, int target) {
		
		int l=0, h=matrix[desiredRow].length-1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			
			if(matrix[desiredRow][mid] == target) return true;
			else if(matrix[desiredRow][mid] > target) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		
		return false;
	}
}
