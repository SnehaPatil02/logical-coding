package scratch;


class Emp {
	
}

public class Conversion_ObjectToString {
	public static void main(String[] args) {
		
//		Emp e = new Emp ();
//		String s = e.toString();
//		String s1 = String.valueOf(e);
//		System.out.println(s);
//		System.out.println(s1);
		
//		//reverse string using StringBuilder is the example here
//		String s = "hello";
//		StringBuilder sb = new StringBuilder(s);
//		
//		sb.reverse();
//		String rev = sb.toString();
//		System.out.println("String is : " +s);
//		System.out.println("Reverse String :" +rev);
		
		//you can write palindrome string
		
		String s = "kayak";
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		String rev = sb.toString();
		if(s.equals(rev)) {
			System.out.println("This is Palindrome string");
		}
		else {
			System.out.println("This is not a palindrome string");
		}
		
		
	}
}
