package scratch;

public class Matrix_SumOfRowsAndCols {

	public static void main(String[] args) {
		int a[][]=new int[][] {{1,2,3},{2,3,4},{3,4,5}};
		int rows = a.length, cols = a[0].length;
		
		int sumRows =0;
		int sumCols =0;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				sumRows += a[i][j];
			}
				System.out.println("Sum of " + (i+1) +"th rows :" +sumRows);
			
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				sumCols += a[i][j];
			}
				System.out.println("Sum of " + (i+1) +"th cols : " +sumCols);
			
		}

	}

}
