package scratch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Conversion_DateToString {

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
		
		String s = dateFormat.format(date);
		System.out.println(s);

	}

}
