package scratch;

public class String_IndividualCharacters {

	public static void main(String[] args) {
		String str = "Characters";
		
		System.out.println("Individual characters from a given string ");
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) +" ");
		}

	}

}
