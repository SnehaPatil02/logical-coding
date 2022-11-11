package Interview;


//find the first value greater than or equal to x in a given array of sorted integer
public class BSApplication2 {
	static int binarySearch(int arr[], int x, int left, int right ) {
		
		
		
		
			int mid = (left + right)/2;
			if(left>right) {
				System.out.println("Right " +right);
				System.out.println(left);
				return left;
			}

		if(arr[mid] >= x) {

	
			return binarySearch(arr, x, left, mid-1);

		}else {

				return binarySearch(arr, x, mid+1, right);
		}

		
		
		
	}


	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9};
		int x = 4;
		int n = arr.length;
				
				int ans = BSApplication2.binarySearch(arr, x, 0, n-1);
				
				System.out.println("The value greater than x is :" +arr[ans]);
		

	}
	
	
}
