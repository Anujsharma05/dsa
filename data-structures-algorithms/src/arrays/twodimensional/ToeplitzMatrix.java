package arrays.twodimensional;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		
		int arr[][] = {{1,4,3,4},{0,1,2,3}};
		
		ToeplitzMatrix obj = new ToeplitzMatrix();
		boolean output = obj.isToeplitzMatrix(arr);
		System.err.println(output);
	}
	public boolean isToeplitzMatrix(int[][] matrix) {
        
		int rows = matrix.length;
		
		for(int i=0; i<rows-1; i++) {
			for(int j=0; j<matrix[i].length-1; j++) {
				if(matrix[i][j] != matrix[i+1][j+1]) {
					return false;
				}
			}
		}
		return true;
    }
}
