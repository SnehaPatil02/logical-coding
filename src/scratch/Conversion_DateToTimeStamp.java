package scratch;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion_DateToTimeStamp {
	public static void main(String[] args) {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
		
		//without milliseconds
		Date date1 = new Date();
		Timestamp ts1 = new Timestamp(date1.getTime());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sd.format(ts1));
	}
}
