package scratch;

public class Matrix_LowerTriangle {
	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{2,3,4},{3,4,5}};
		int row = a.length, col = a[0].length;
		
		if(row != col) {
			System.out.println("Matrix should be square matrix ");
		}else {
		System.out.println	("Lower triangle matrix : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(j > i) {
					System.out.print("0 ");
				}else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
		}
	}
}
