package Interview;

import java.util.ArrayList;

public class BSApplications5 {

	 int binarySearch(ArrayList<String> a, String target) {
		return binarySearch(a, target, 0, a.size()-1);
	}
	 
	 
	 
	private int binarySearch(ArrayList<String> a, String target, int left, int right) {
	int mid = (left + right)/2;
	if(left > right) {
		return left;
	}
	if(a.size() == 0) {
		return 0;
	}if(target.equals(a.get(mid))) {
	    return mid;
	}if(a.get(mid).compareTo(target) < 0) {
		return binarySearch(a, target, mid+1 , right);
	}else {
		return binarySearch(a, target, left, mid-1);
	}
	}
	
	
	public static void main(String[] args) {
		  ArrayList<String> a = new ArrayList<String>();
		    a.add("Volvo");
		    a.add("BMW");
		    a.add("Ford");
		    a.add("Mazda");
		   
		  
		
		String target = "BMW";
		
		BSApplications5 bsa = new BSApplications5();
		System.out.println("The index at "+bsa.binarySearch(a, target) + " target is : " +a.get(bsa.binarySearch(a, target)));

	}

}
