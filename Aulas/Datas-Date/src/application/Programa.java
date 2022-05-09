package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Programa{
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Date x1 = new Date();
		//Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("18/04/2022");
		Date y2 = sdf2.parse("18/04/2022 15:27:04");
		
		Date x3 = Date.from(Instant.parse("2022-04-18T15:42:07Z"));
		
		System.out.println("" + sdf2.format(y1) + "\n" + sdf2.format(y2));
		
		System.out.println(x3);
				
	}

}
