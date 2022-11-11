package scratch;

public class Conversion_LongToInt {
	public static void main(String[] args) {
		long l = 3434;
		int i = (int)l;//typecasting
		System.out.println(i);
		
		Long l1 = new Long(234);
		int i1 = l1.intValue();								
		System.out.println(i1);
	}
}
