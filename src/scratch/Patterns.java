package scratch;

public class Patterns {

	public static void main(String[] args) {
		int lines=4;    
		int i , j;
		for(i=0;i<lines;i++){// this loop is used to print lines    
			for( j=0;j<lines;j++){// this loop is used to print * in a line    
				if(i==j)    
					System.out.print("*");    
				else    
					System.out.print("0");    
			}    
			j--;    
			System.out.print("*");    
			//		      while(j>=0){// this loop is used to print * in a line    
			//		          if(i==j)    
			//		           System.out.print("*");    
			//		          else    
			//		           System.out.print("0");    
			//		          j--;    
			//		      } 

			for( j=lines-1;j>=0;j--){// this loop is used to print * in a line    
				if(i==j)    
					System.out.print("*");    
				else    
					System.out.print("0");    
			}    

			System.out.println("");    
		}    
	}    



}
