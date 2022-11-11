package scratch;

public class Conversion_StringToInt {

	public static void main(String[] args) {
		//using Integer.parseInt()
//		String s = "200";
		
//		int i = Integer.parseInt(s);
//		System.out.println(i);
//		System.out.println(s + 100);
//		System.out.println(i + 100);
		
		//using Integer.valueOf()
//		Integer i = Integer.valueOf(s);
//		System.out.println(i);
//		System.out.println(s + 100);
//		System.out.println(i + 100);

		//passing words instead of numbers as input
		String s = "hello";
		
		int i = Integer.valueOf(s);
		System.out.println(i); //gives NumberFormatException 
		
	}

}
