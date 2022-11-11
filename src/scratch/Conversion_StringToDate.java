package scratch;



import java.text.SimpleDateFormat;
import java.util.Date;


public class Conversion_StringToDate {
	public static void main(String[] args) throws Exception {
		String s = "29/12/2021";
		 
	    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(s);
	    System.out.println(s + " " + date);
		
	}
}
