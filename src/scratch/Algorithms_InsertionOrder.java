package scratch;

public class Algorithms_InsertionOrder {
	public static void main(String[] args) {
		int arr[] = new int[] {23,45,2,3,1,56,45};
		
		System.out.println("Array before insertion order ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		insertionOrder(arr);
		
		System.out.println("Array after insertion order");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}
	
	static void insertionOrder(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
				int	temp = arr[i];
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
	}
}
