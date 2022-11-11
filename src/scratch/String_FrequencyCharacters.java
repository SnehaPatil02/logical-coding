package scratch;

public class String_FrequencyCharacters {

	public static void main(String[] args) {
		String str = "Picture perfect";
		int[] freq = new int[str.length()];
		String str1 = str.toLowerCase();
		
		char ch[] = str1.toCharArray();
		for(int i=0; i<str1.length(); i++) {
			freq[i] = 1;
			for(int j=i+1; j<str1.length(); j++) {
				if(ch[i] == ch[j]) {
					freq[i]++;
					//to avoid printing visited characters
					ch[j] = 0;
				}
			}
		}
		
		System.out.println("Frequency of each character ");
		for(int i=0; i<str1.length(); i++) {
			if(ch[i] != ' ' && ch[i] != '0') {
				System.out.println(ch[i]+ " " + freq[i]);
			}
		}

	}

}
