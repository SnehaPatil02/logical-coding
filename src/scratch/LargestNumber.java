package scratch;

public class LargestNumber {
	public static void main(String[] args) {
	int arr[] = new int[] {25, 7, 45, 90};
	int max = arr[0];
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	System.out.println("Largest Number is : "+ max);
}
}
