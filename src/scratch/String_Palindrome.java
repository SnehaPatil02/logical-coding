package scratch;

public class String_Palindrome {

	public static void main(String[] args) {
	String str = "Malayalam";
	str = str.toLowerCase();
	
	boolean flag = true;
	
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i) != str.charAt(str.length()-i-1)) {
			flag = false;
			break;
		}
	}
		if(flag) {
			System.out.println("String is a palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
	

	}

}
