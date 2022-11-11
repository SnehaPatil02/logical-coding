package scratch;

public class String_ReplaceSpace {

	public static void main(String[] args) {
		String str = "Once in a blue moon";
		char ch = '-';
		
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i)) == ' ') {
				str = str.replace(' ', ch);
			}
			
		}
		System.out.println("After replacing white space with specific character " +str);
	}

}
