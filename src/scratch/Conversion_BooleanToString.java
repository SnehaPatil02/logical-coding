package scratch;

public class Conversion_BooleanToString {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		String s1 = String.valueOf(b1);
		String s2 = String.valueOf(b2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		String s3 = Boolean.toString(b1);
		String s4 = Boolean.toString(b2);
		
		System.out.println(s3);
		System.out.println(s4);
	}
}
