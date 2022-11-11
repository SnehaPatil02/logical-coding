package scratch;

public class Conversion_IntToLong {
	public static void main(String[] args) {
		
		//using assignment operator
		int i = 200;
		long l = i;
		System.out.println(l);
		
		//using Long.valueOf()
		int ii =300;
	
		Long ll1 = new Long(ii); // first way
		Long ll2 = Long.valueOf(ii); // second way
		System.out.println(ll1);
		System.out.println(ll2);
	}
}
