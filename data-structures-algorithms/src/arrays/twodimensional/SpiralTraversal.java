package arrays.twodimensional;

public class SpiralTraversal {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
		spiralTraverse(arr);
	}
	
	private static void spiralTraverse(int[][] arr) {
		
		int row = arr.length;
		if(row == 0) return;
		int col = arr[0].length;
		
		int left=0, top=0, dir=0;
		int down=row-1, right=col-1;
		
		while(left<=right && top<=down) {
			
			if(dir==0) {
				for(int i=left; i<=right; i++) {
					System.out.print(arr[top][i] + " ");
				}
				top+=1;
			} else if(dir == 1) {
				for(int i=top; i<=down; i++) {
					System.out.print(arr[i][right] + " ");
				}
				right-=1;
			} else if(dir==2) {
				for(int i=right; i>=left; i--) {
					System.out.print(arr[down][i] + " ");
				}
				down-=1;
			} else if(dir==3) {
				for(int i=down; i>=top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left+=1;
			}
			
			dir = (dir+1)%4;
		}
	}

	private static void spiral(int[][] arr) {
		if(arr.length == 0) return;
		int x=0,y=0;
		int totalCount = arr.length * arr[0].length;
		int count = 0;
		int iteration = 0;
		int row = arr.length-1;
		int col = arr[0].length-1;
		while(count < totalCount) {
			
			while(y <= col) {
				System.out.print(arr[x][y] + " ");
				count++;
				y++;
			}
			
			if(count >= totalCount) break;
			
			y=col;
			x++;
			while(x<=row) {
				System.out.print(arr[x][y] + " ");
				count++;
				x++;
			}
			if(count >= totalCount) break;
			x=row;
			y--;
			while(y>=iteration) {
				System.out.print(arr[x][y] + " ");
				count++;
				y--;
			}
			if(count >= totalCount) break;
			y=0;
			x--;
			while(x>iteration) {
				System.out.print(arr[x][y] + " ");
				count++;
				x--;
			}
			iteration++;
			if(count >= totalCount) break;
			x++;
			y++;
			row--;
			col--;
		}
	}

}
