package scratch;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a, b, c, temp, largest;
		System.out.println("Enter 1st number");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		b = sc.nextInt();
		
		System.out.println("Enter 3rd number");
		c = sc.nextInt();
		
		//comparing a and b variables using ternery operator.
//		Java Ternary operator is used as one line replacement for 
//		if-then-else statement and used a lot in Java programming. 
//		It is the only conditional operator which takes three operands.
		// variable_name = (expression) ? value if true:value if false  
			temp = (a>b)?a:b;
			largest = (c>temp)?c:temp;
			System.out.println("Largest number is :" +largest);
		
		

	}

}
