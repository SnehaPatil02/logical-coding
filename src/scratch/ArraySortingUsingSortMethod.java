package scratch;

import java.util.Arrays;

public class ArraySortingUsingSortMethod {

	public static void main(String[] args) {
		int arr[] = new int[] {23, 34, 12, 22, 11};
		System.out.println("Sorted Array using sort method is :");
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
