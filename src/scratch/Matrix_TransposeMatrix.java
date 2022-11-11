package scratch;

public class Matrix_TransposeMatrix {

	public static void main(String[] args) {
//		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
//		int row = a.length;
//		int col = a[0].length;
//		System.out.println("The original matrix :");
//		for(int i=0; i<row; i++) {
//			for(int j=0; j<col; j++) {
//				System.out.print(" "+a[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("The transpose of given matrix :");
//		for(int i=0; i<row; i++) {
//			for(int j=0; j<col; j++) {
//				if(i>j) {
//				int temp = a[i][j];
//				a[i][j] = a[j][i];
//				a[j][i] = temp;
//				}
//			}
//		}
//				for(int ii=0; ii<row; ii++) {
//					for(int jj=0; jj<col; jj++) {
//						System.out.print(" "+a[ii][jj]);
//					}
//					System.out.println();
//				}
//				
//			
//		
//		System.out.println();
//
		
		
		
		
		
		int a[][] =new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int row = a.length;
		int col = a[0].length;
	
		int transpose [][] = new int [3][3];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				transpose[i][j] = a[j][i];
			}
			}
		
		System.out.println("Original matrix :");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("After transpose :");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++) {
				System.out.print(" "+transpose[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
