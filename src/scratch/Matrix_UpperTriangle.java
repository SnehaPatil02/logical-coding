package scratch;

public class Matrix_UpperTriangle {
	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int row = a.length;
		int col = a[0].length;
		
		if(row != col) {
			System.out.println("Matrix should be square matrix ");		
	}else {
		System.out.println("Upper triangle matrix : ");
	for(int i=0; i<row; i++) {
		for(int j=0; j<col; j++) {
			if(i>j) {
				System.out.print("0 ");
			}
			else {
				System.out.print(a[i][j] + " ");
				
			}
		}
		System.out.println();
	}
	}
	}
}
