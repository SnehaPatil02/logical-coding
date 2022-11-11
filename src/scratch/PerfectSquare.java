package scratch;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(checkPerfectSquare(num)) {
			System.out.println("It's a perfect square");
		}else {
			System.out.println("It's not a perfect square");
		}
	}
	static boolean checkPerfectSquare(int num) {
		for(int i = 1; i*i <= num; i++) {
			if((num % i == 0) && (num / i == i)) {
				return true;
			}
		}
		return false;
	}
}
