package scratch;

public class ThirdLargestNumber {
//	static int getThirdLargest(int[] arr) {
//		int temp;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//		}
//		return arr[arr.length-3];
//	}
//	public static void main(String[] args) {
//		int arr[] = new int[] {3, 4, 5, 6, 7};
//		System.out.println("Third largest number : " +getThirdLargest(arr));
//		
//	}
	
	
	public static void main(String[] args) {
		int arr[] = new int[] {3, 5, 2, 5, 1};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}

		}
			System.out.println("Third largest number :");
		
			System.out.println(+arr[arr.length-2]);
		
		
	}
}
