package Interview;


//to find if n is a square of an integer
public class ApplicationsOfBinarySearch {
	static int binarySearch(int n, int left, int right) {
		int mid = (left + right)/2;
		if(left > right) {
			return -1;
		}
		if(mid*mid == n) {
			return mid;
		}
		else if(mid*mid > n){
			return binarySearch(n, left, mid -1);
		}else {
			return binarySearch(n, mid +1, right);
		} 
		
	
	}
	
	
	public static void main(String[] args) {
		
		int n = 25;
		
				System.out.println(binarySearch(n, 0, n-1));
			
			
	}
	
}
