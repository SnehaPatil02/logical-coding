package scratch;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int arr[] = new int[] {10, 50, 30, 50, 40, 40};
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[i+1]) {
			int	temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("Sorted array : " +arr[i]);
		
		}
	}

}
