package scratch;

public class String_CaseConversion {

	public static void main(String[] args) {
		String str = "God is Great";
		
		StringBuffer newStr = new StringBuffer(str);
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				newStr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("After case conversion the string is like :" +newStr);
		

	}

}


// In this program : 
//StringBuffer is used, this class has setCharAt();
// isLowerCase(), isUpperCase(), toLowerCase(), toUpperCase(), of character class is used.