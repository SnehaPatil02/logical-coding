package scratch;

import java.util.Scanner;

public class String_ReverseString {

	public static void main(String[] args) {
		
		String_ReverseString rev = new String_ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = sc.nextLine();
		System.out.println("After reverse string is :" + rev.reverse(s));

		//using for loop
//		for(int i=s.length()-1; i>=0; i-- ) {
//			System.out.print(s.charAt(i));
//		}
		
		
		//using while loop
//		int i = s.length();
//		while(i>0) {
//			System.out.print(s.charAt(i-1));
//			i--;
//		}
		
		
		//using static method
	}
		static String reverse(String str) {
			String rev="";
			
		for(int i=str.length(); i>0; --i) {
			rev = rev+(str.charAt(i-1));
		}
		
		return rev;	
		
		}
		
		
	

}
