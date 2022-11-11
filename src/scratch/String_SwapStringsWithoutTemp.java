package scratch;

public class String_SwapStringsWithoutTemp {

	public static void main(String[] args) {
		String str1 = "Good";
		String str2 = "Morning";
		
		System.out.println("String Before Swapping :" +str1+ " " +str2);
		
		str1 = str1 +str2;
		
		str2 = str1.substring(0, str1.length() -str2.length());
		 //System.out.println(str2);
		 
		 str1 = str1.substring(str2.length());
		 
		 //System.out.println(str2.length());
		 
		 System.out.println("String after swappimg : " +str1+ " " +str2);

	}

}
