package scratch;

public class Conversion_IntToChar {
	public static void main(String[] args) {
//		int i = 10;
//		char c = (char)i;
//		System.out.println(c);//  it will store ASCII character of given number which is start of heading which is not printable. 
//							  // So it will not print anything on the console.
//	
	
		int i1 = 1;
		char c1 = (char)(i1+'0');// If you add '0' with int variable, it will return actual value in the char variable. 
		System.out.println(c1);// The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes 49 which is equal to 1. 
								//The ASCII character of 49 is 1.
		
		
		int i2 = '1';//If you store integer value in a single quote, it will store actual character in char variable.
		char c2 = (char)i2;
		System.out.println(c2);
		
	}
}
