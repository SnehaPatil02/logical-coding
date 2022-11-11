package scratch;

import java.util.Scanner;

public class Factorial {
	
	static int factorialOf(int n) {
		if(n == 0) {
			return 1;
		}else 
			return (n * factorialOf(n-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int fact = 1;
		fact = factorialOf(n);
		System.out.println("Factorial of "+ n + " is : " + fact);
	}

}
