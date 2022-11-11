package Interview;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class SlidingWindow_Permutation {
	
	
	static void permutation(String X, String Y) {
		int m = Y.length(), n = X.length();
		if(m == n) {
			System.out.println(Y);
		}
		Multiset<Character> window = HashMultiset.create();
		
		Multiset<Character> set = HashMultiset.create();
		
		for(int i=0; i<m; i++) {
			set.add(Y.charAt(i));
		}
		
		for(int i=0; i<n; i++) {
			if(i < m) {
				window.add(X.charAt(i));
			}
			else {
				if(window.containsAll(set)) {
					System.out.println("The SubString " +X.substring(i-m, i)+ " at the index :" +(i-m));
				}
				
				if(window.contains(X.charAt(i-m))) {
					window.remove(X.charAt(i-m));
				}
				window.add(X.charAt(i));
			}
		}
		
	}

	public static void main(String[] args) {
		String X = "XYYZXZYZXXYZ";
		String Y = "XYZ";
		
		SlidingWindow_Permutation.permutation(X,Y);

	}

}
