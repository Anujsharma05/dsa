package arrays;

public class FindPairs {

	public static void main(String[] args) {
		
		int[] myArray = {2,4,3,5,6,-2,4,7,8,9};
		int sum = 7;
		String output = pairSum(myArray, sum);
		System.out.print(output);
	}
	public static String pairSum(int[] myArray, int sum) {
		boolean[] visited = new boolean[myArray.length];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<myArray.length; i++) {
			
			for(int j=i+1; j<myArray.length; j++) {
				
				if(myArray[i] + myArray[j] == sum && !visited[j]) {
					visited[j] = true;
					sb.append(myArray[i]).append(":").append(myArray[j]).append(" ");
				}
			}
		}
		if(sb.length() > 0) {
			return sb.substring(0, sb.length()-1);
		} else {
			return sb.toString();
		}
  }
}
