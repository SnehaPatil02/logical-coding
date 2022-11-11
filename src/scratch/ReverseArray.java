package scratch;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = new int[] {2,3,1,5,0};
		System.out.println("Elements of the original array ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Elemnets in reverse order ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]+ " ");
		}
	
		

	}

}
