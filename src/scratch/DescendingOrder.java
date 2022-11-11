package scratch;

public class DescendingOrder {
	public static void main(String[] args) {
		int arr[] = new int[] {33, 11, 44, 22, 1};
		
		System.out.println("The original array :");
		for(int i=0; i<arr.length; i++) {
			System.out.println(+arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++)
			if(arr[i]<arr[j]) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
			System.out.println();
			System.out.println("Descending order : ");
			for(int i=0; i<arr.length; i++) {
				System.out.println(+arr[i]);
			
		}
	}
}
