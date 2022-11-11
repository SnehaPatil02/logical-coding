package scratch;

public class Conversion_StringtoBoolean {
	public static void main(String[] args) {
		String s = "true";
		String s1 = "tRuE";
		String s2 = "hello";//string should contain true to get boolean true. Case is ignored
		boolean b = Boolean.parseBoolean(s);
		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		
		
		//using Boolean.valueOf()
		String ss = "true";
		boolean bb = Boolean.valueOf(ss);
		System.out.println(bb);
		
		
	}
}
