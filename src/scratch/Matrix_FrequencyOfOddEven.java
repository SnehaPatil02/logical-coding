package scratch;

public class Matrix_FrequencyOfOddEven {

	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{2,3,4},{3,4,5}};
		int row = a.length, col = a[0].length, countEven = 0, countOdd = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(a[i][j] %2 == 0 ) {
					countEven++;
				}else {
					countOdd++;
				}
			}
		}
		System.out.println("Even numbers : " +countEven++);
		System.out.println("Odd numbers : " +countOdd++);
	}

}
