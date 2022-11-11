package scratch;

public class Algorithms_LinearSearch {
	
	public static int linearSearch(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
		if(arr[i] == key) {
			return i;
		}
		}
		System.out.println("No element found");
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {70,20,40,60,50,30};
		int key = 70;
		
		int index = linearSearch(arr, key);
		if (index != -1){
			System.out.println(key +" is found at the index "+ index);
		}
	}
	
	
	
}
