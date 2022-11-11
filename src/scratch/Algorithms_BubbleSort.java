package scratch;

public class Algorithms_BubbleSort {

	public static void main(String[] args) {
	int arr[] = new int[] {33,43,29,67,84,18};
	
	System.out.println("Array before bubble sort ");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	bubbleSort(arr);
	
	System.out.println("Array after bubble sort ");
	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	}
	
	public static void bubbleSort(int arr[]) {
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
