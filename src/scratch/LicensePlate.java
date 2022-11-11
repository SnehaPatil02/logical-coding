package scratch;

import java.util.Arrays;

public class LicensePlate {
	public static void main(String[] args) {
 String[] words = {"stepes","steps","pestss","stepple"};
String s = shortestCompletingWord("1s3 PSt", words);

	//System.out.println(s);
	
	}
	 public static String shortestCompletingWord(String licensePlate, String[] words) {
	       String s = licensePlate.toLowerCase();
	        int [] charMap = new int[26];
	        System.out.println(Arrays.toString(charMap)+ " ");
	        for(int i = 0 ; i < s.length(); i++){
	            if(Character.isLetter(s.charAt(i))) 
	                charMap[s.charAt(i) - 'a']++;
	           // System.out.println(s.charAt(i) );
	            
	        }
	        System.out.println(Arrays.toString(charMap));
	        int minLength = Integer.MAX_VALUE;
	        String result = null;
	        for (int i = 0; i < words.length; i++){
	            String word = words[i].toLowerCase();
	            if(matches(word, charMap) && word.length() < minLength) {
	                minLength = word.length();
	                result  = words[i];
	            }
	        }
	        return result;
	    }
	
	 private static boolean matches(String word, int[] charMap){
	        int [] sMap = new int[26];
	        for(int i = 0; i < word.length(); i++){
	            if(Character.isLetter(word.charAt(i))) sMap[word.charAt(i) - 'a']++;
	        }
	        
	        for(int i = 0; i < 26; i++){
	            if(charMap[i]!=0 && sMap[i]<charMap[i]) return false;
	        }
	        return true;
	    }
	 	
}
