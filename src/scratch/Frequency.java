package scratch;

public class Frequency {
	public static void main(String args[]) {
		//Intializing array
		int arr[] = new int[] {2,3,2,2,4,5,5,4};
		
		//fr[] will store frequency of element
		int fr[] = new int[arr.length];
		
		int visited = -1;
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j])  {
					count++;
					
					//To avoid counting same number again
					fr[j] = visited;
					
				}
				if(fr[i] != visited)
					fr[i] = count;
					
			}
		}
			System.out.println("Elements     Frequency ");
			for(int i=0; i<fr.length; i++) {
				if(fr[i] != visited)
				System.out.println("  "+ arr[i]+ "            " +fr[i]);
			
		}
	}
	
}
