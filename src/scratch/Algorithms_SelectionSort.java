package scratch;

public class Algorithms_SelectionSort {

	public static void main(String[] args) {
		int arr[] = new int[] {23,45,12,23,36,11,99};
		 System.out.println("Array before sorting ");
		 for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 selectionSort(arr);
		 
		 System.out.println("After sorting ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
		static void selectionSort(int arr[]) {
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
				
			}
		}
		

}
