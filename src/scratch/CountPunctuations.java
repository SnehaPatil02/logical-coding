package scratch;

public class CountPunctuations {

	public static void main(String[] args) {
		int count = 0;
		String str = "Sanjeev is your Husband, he doesn't loves you!?";
		
		for(int i=0; i < str.length(); i++) {
	
			if(str.charAt(i) == '!' || str.charAt(i) == '"' || str.charAt(i) == ':' 
					|| str.charAt(i) == ';' || str.charAt(i) == ',' || str.charAt(i) == '?')
			{
			count++;
		
		}
		}
		System.out.println("The number of punctuation exits in the string :" +count);

	}

}
