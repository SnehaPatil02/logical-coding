package scratch;

public class SubtractTwoMatrices {
	public static void main(String[] args) {
		int a[][] = new int[][] {{5,6,7}, {5,6,7}, {7,8,9}};
		int b[][] = new int[][] {{2,3,4}, {2,3,4}, {5,6,7}};
		int c[][] = new int[3][3];
		
		System.out.println("The subtraction of two matrices : ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
