package scratch;

public class SmallestNumber {
	public static void main(String[] args) {
		int arr[] = new int[] {23, 1, 56, 9};
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				
			}
		}
		System.out.println("Smallest number is : " +min);
	}
}
