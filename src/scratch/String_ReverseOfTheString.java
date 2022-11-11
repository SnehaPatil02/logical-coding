package scratch;

public class String_ReverseOfTheString {

	public static void main(String[] args) {
		String str = "Dream big";
		String reverseStr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr = reverseStr + str.charAt(i);
			}
		System.out.println("The original string : " +str);
		
		System.out.println("The reversed string : "+reverseStr);
	}

}
