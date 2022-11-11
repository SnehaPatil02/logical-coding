package scratch;

import java.util.Arrays;

public class String_SmallPalinLargePalin {
	public static void main(String[] args) {
		String str = "wow you own kayak";
		
		String smallPalin = "", largePalin = "";
		
		
		String str1 = str.toLowerCase();
		String words[] = str1.split(" ");
		
		System.out.println(Arrays.toString(words));
		//loop words
		//check isPalindrome = true
		//check word length if it is smaller than smallPalin, assign it to the smallPalin,
		//and if it is larger than largePalin, assign it to the largePalin
		
		for(int i=0; i<words.length; i++) {  
			if(isPalindrome(words[i])) {
				if(smallPalin.length()==0 || words[i].length() < smallPalin.length()) {
					smallPalin =  words[i];
				}
				if(words[i].length() > largePalin.length()) {
					largePalin =  words[i];
				}
			
			}
		}
			System.out.println("Small Palindrome- " + smallPalin  +" Large Palindrome " + largePalin );
		
	}
		static boolean isPalindrome(String s) {
			boolean flag = true;
			for(int i=0; i<s.length()/2; i++) {
				if(s.charAt(i) != s.charAt(s.length()-i-1)) {
					flag = false;
					break;
																					
	
				}
					
			}
			return flag;
		}
		
	
}
