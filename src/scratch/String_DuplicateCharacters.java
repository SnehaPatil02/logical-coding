package scratch;

public class String_DuplicateCharacters {

	public static void main(String[] args) {
		String str = "Great responsibility";
		int count = 0;
		char[] ch = str.toCharArray();
		
		System.out.println("Duplicate characters in the string ");
		
		for(int i=0; i<ch.length; i++) {
		count = 1;
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0'){
					count++;
				
				ch[j] = '0';
			}
	}
		
		if(count > 1 ) {
			System.out.println(ch[i]);
		}
		}
		
		
		
//		 String string1 = "Great responsibility";    
//	        int count;    
//	            
//	        //Converts given string into character array    
//	        char ch[] = string1.toCharArray();    
//	            
//	        System.out.println("Duplicate characters in a given string: ");    
//	        //Counts each character present in the string    
//	        for(int i = 0; i <ch.length; i++) {    
//	            count = 1;    
//	            for(int j = i+1; j <ch.length; j++) {    
//	                if(ch[i] == ch[j] && ch[i] != ' ') {    
//	                    count++;    
//	                    //Set string[j] to 0 to avoid printing visited character    
//	                    ch[j] = '0';    
//	                }    
//	            }    
//	            //A character is considered as duplicate if count is greater than 1    
//	            if(count > 1 && ch[i] != '0')    
//	                System.out.println(ch[i]);    
//	        }    
	}

}
