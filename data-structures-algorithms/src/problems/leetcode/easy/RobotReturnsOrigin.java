package problems.leetcode.easy;

public class RobotReturnsOrigin {

	public static void main(String[] args) {
		String moves = "UUUUUUUUUL";
		boolean robotOnOrigin = judgeCircle(moves);
		System.err.println(robotOnOrigin);
	}
	public static boolean judgeCircle(String moves) {
        
		int xCoordinate = 0;
		int yCoordinate = 0;
		
		for(int i=0; i<moves.length(); i++) {
			
			switch(moves.charAt(i)) {
			case 'L':
				xCoordinate -= 1;
				break;
			case 'R':
				xCoordinate += 1;
				break;
			case 'U':
				yCoordinate += 1;
				break;
			case 'D':
				yCoordinate -= 1;
			}
		}
		
		return xCoordinate == 0 && yCoordinate == 0 ? true : false;
    }
}
