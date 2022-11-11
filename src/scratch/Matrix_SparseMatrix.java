package scratch;

public class Matrix_SparseMatrix {

	public static void main(String[] args) {
	int a[][] = new int[][] {{1,2,0},{3,0,0},{4,0,0}};
	
	int count =0;
	
	int row = a.length;
	int col = a[0].length;
	
	int size = row*col;
	for(int i=0; i<row; i++) {
		for(int j=0; j<col; j++) {
			if(a[i][j] == 0) {
				count++;
			}
		}
	}
			if(count > (size/2)) {
				System.out.println("It is a sparse matrix ");
			}else {
				System.out.println("It is not sparse matrix ");
			}
		}
	

	

}
