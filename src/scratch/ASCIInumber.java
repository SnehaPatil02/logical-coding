package scratch;

import java.util.Scanner;

public class ASCIInumber {

	public static void main(String[] args) {
		//for(int i = 65; i <= 90; i++) {
//		for (int i = 0; i <= 255; i++) {
//			System.out.println("The ASCII value of " + (char)i + " is : " +i);
//		}

		
		System.out.print("Enter a character: ");  
		Scanner sc = new Scanner(System.in);  
		char chr = sc.next().charAt(0);  
		int asciiValue = chr;  
		System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
		}  
	

}
