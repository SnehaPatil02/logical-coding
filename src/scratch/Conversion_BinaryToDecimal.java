package scratch;

public class Conversion_BinaryToDecimal {
	public static void main(String[] args) {
		String s = "101";
		int decimal = Integer.parseInt(s, 2);
		System.out.println(decimal);
		
		System.out.println(Integer.parseInt("10101", 2));
		System.out.println((Integer.parseInt("1011", 2)));
		
		
		//using custom logic
		System.out.println("The Decimal of 1011 :" +getDecimal(10111));
		
	}
		
		static int getDecimal(int i) {
			int res = 0;
			int n = 0;
			while(true) {
				if(i == 0) {
					break;
				}
				else {
					int temp = i % 10;
					res += temp * Math.pow(2,n);
					i = i/10;
					n++;
				}
			}
			return res;
		}
}
