package scratch;

public class SumOfAllElementsOfArray {

	public static void main(String[] args) {
		int arr[] = new int[] {23, 45, 56, 78};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
		}
		System.out.println("Sum of all elements in an array is :" +sum);

	}

}
