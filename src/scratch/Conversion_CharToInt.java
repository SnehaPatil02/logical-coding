package scratch;

public class Conversion_CharToInt {
	public static void main(String[] args) {
		char c = '1';
		int i = c;
		System.out.println(i);// print the ASCII value of a
		
		char c1 = '1';
		int i1 = Character.getNumericValue(c1);
		System.out.println(i1);//gives the numeric value
		
		char c2 = '1';
		int i2 = Integer.parseInt(String.valueOf(c2));
		System.out.println(i2);// gives the numeric value
	}
}
