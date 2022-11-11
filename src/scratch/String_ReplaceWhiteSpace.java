package scratch;

public class String_ReplaceWhiteSpace {

	public static void main(String[] args) {
		String str = "Replacing all white space in a string.";
		
		//removing all white space using regex 
		str = str.replaceAll("\\s+","");
		
		System.out.println(str);
	}
}
