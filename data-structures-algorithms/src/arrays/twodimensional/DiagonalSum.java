package arrays.twodimensional;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][] a = {{4}};
		int sum = sumDiagonal(a);
		System.out.print(sum);

	}

	public static int sumDiagonal(int[][] a) {
		 
		int sum = 0;
		for(int i=0; i<a.length;i++) {
			sum = sum + a[i][i];
		}
		return sum;
    }
}
