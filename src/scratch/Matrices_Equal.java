package scratch;

public class Matrices_Equal {
	public static void main(String[] args) {
		int a[][] = new int[][] {
				{1,2,3},
				{1,2,3},
				{1,2,3}
		};
		
		int b[][] = new int[][] {
			{1,2,3},
			{1,2,3},
			{1,2,3}
			};
			
			int row = a.length;
			int col = a[0].length;
			int row1 = b.length;
			int col1 = b[0].length;
			boolean flag = true;
			
		if(row != col || row1 != col1) {
			System.out.println("Matrices are not equal");
		}
		else {
			for(int i=0; i<row; i++) {
				for(int j=0; j<row; j++) {
					if(a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
		
			if(flag) {
				System.out.println("Matrices are equal");
			}else {
				System.out.println("Matrices are not equal");
			}
		}
	}
}
