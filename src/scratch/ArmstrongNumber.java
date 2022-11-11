package scratch;

import java.util.Scanner;

public class ArmstrongNumber {

	public static boolean isArmstrong(int n) {
	int temp, last = 0, digits = 0, sum = 0;

	temp = n;
	while(temp > 0) {
		temp = temp/10;
		digits++;
	}
	temp = n;
	while(temp > 0) {
		last = temp % 10;
		sum += (Math.pow(last, digits));
		temp = temp/10;
	
	}
	if(n == sum) {
		return true;
	}else return false;
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(isArmstrong(n)) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}

}
