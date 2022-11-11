package scratch;

public class scratch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean v = isPowerOfFour(17);
		System.out.println(v);
	}
	
	public static boolean isPowerOfFour(int n) {
        while(n>=4){
         if(n%4 ==0) {
        	 
        	 n = n/4;
        	 if (n==1) {
        		 return true;
        	 }
        	 
        	 }
         else { return false;}
         }
    
	return false;
	}
}
