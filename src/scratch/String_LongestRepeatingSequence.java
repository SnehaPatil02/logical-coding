package scratch;

public class String_LongestRepeatingSequence {
	public static String lcp(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for(int i=0; i<n; i++) {
			if(s.charAt(i) != t.charAt(i)) {
				return s.substring(0,i);
			}
		}
		return t.substring(0,n);
	}
	
	public static void main(String[] args) {
		String str = "abcdefghbdf";
		String res = " ";
		
		int n = str.length();
		System.out.println("Longest repeating sequence : ");
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				String s = lcp(str.substring(i, n), str.substring(j, n));
				if(s.length() >= res.length()) {
					res = s;
					System.out.println( res);
				}
			}
		}
	}

}
