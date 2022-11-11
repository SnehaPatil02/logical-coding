package scratch;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int arr[] = new int[] {2,5,3,1,6};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] =temp;
					
				}
			}
		}
		System.out.println("Second smallest number : " + arr[arr.length-2]);
	}

}
