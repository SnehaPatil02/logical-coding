package scratch;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(100);
		int b = random.nextInt(1000000);
		System.out.println("Random Number between 0 and 100 : " +a);
		System.out.println("Random Number between 0 and 1000 : " + b);
			

	}

}
