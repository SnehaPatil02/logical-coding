package scratch;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		int a[][] = new int[][] {{1,1,1},{2,2,2},{3,3,3}};
		int b[][] = new int[][] {{1,1,1},{2,2,2},{3,3,3}};
		int c[][] = new int[3][3];
		
		System.out.println("Multiplication of two matrices : ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j] = 0;
				//System.out.println("J values : " +a[i][j] + " ");
			//}
				for(int k=0; k<3; k++) {
					//System.out.print(a[i][k]*b[k][j] +" ");
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
			}
				//System.out.println();
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
