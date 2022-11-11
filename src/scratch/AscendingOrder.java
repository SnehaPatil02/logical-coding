package scratch;

public class AscendingOrder {

	public static void main(String[] args) {
		
		int arr[] = new int[] {23, 45,32,1,5};
		System.out.println("The original array :");
		for(int i=0; i<arr.length; i++) {
			System.out.println(+arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]>arr[j]) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		}
		}
		
		System.out.println("The ascending order : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(+arr[i]);
		}
	}

}
