package Interview;

public class BSApplication3 {
	static int binarySearch(int arr[], int left, int right) {
		int mid = (left + right)/2;
		
		if(left == right) {
			return left;
		}
		else if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
			System.out.println("Left :" +arr[left]);
			return mid;
		}
		
		else if(((arr[mid-1]) > arr[mid] ) && ((arr[mid+1]) < arr[mid])){
			System.out.println("Left 2 :" +arr[left]);
			return binarySearch(arr, left, mid -1);
		}
		
		else {
			System.out.println("Right :" +arr[right]);
			return binarySearch(arr, mid+1, right);
		}
	}
	public static void main(String[] args) {
	int arr[] = {1,2,5,6,8,5,4,3,2,1};
	int n = arr.length;
	System.out.println("The peak value is :" +arr[BSApplication3.binarySearch(arr, 0, n-1)]);

	}

}
