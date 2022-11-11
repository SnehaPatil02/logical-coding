package Interview;

public class BSApplications4 {
	
	static int binarySearch(int arr[],int key, int left, int right) {
		int mid = (left+right)/2;
		
		if(left >= right) {
			return left;
		}
		else if(arr[mid] == key) {
			return mid;
		}
		
		else if(arr[mid] > key) {
			if(arr[mid] >= arr[mid+1]) {
				return binarySearch(arr, key, mid+1, right);
			}
			else {
				return binarySearch(arr, key, left, mid-1);
			}
		}
		else {
			if(arr[mid] >= arr[mid-1]) {
				return binarySearch(arr, key, left, mid-1);
			}
			else {
				return binarySearch(arr, key, mid+1, right);
			}
		}
		
	}
	public static void main(String args[]) {
		int arr1[] = {5,6,7,8,9,10,11,12};
		int arr2[] = {11,10,9,8,7,6,5,4};
		int key =5;
		
		System.out.println("The index of key value in array1 is :"+arr1[BSApplications4.binarySearch(arr1, key, 0, arr1.length-1)]);
		System.out.println("The index of key value in array2 is :" +arr2[BSApplications4.binarySearch(arr2, key, 0, arr2.length-1)]);
	}

}
