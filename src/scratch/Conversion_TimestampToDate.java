package scratch;

import java.sql.Timestamp;
import java.util.Date;

public class Conversion_TimestampToDate {
	public static void main(String[] args) {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date date = new Date(ts.getTime());
		
		System.out.println(date);
		
		
		Timestamp ts1 = new Timestamp(System.currentTimeMillis());
		Date date1 = ts1;
		System.out.println(date1);
		
	}
}
