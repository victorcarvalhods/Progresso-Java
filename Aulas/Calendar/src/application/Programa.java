package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Programa {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date d = Date.from(Instant.parse("2022-04-18T16:00:00Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);//adicionando valor
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		int minuto = cal.get(Calendar.MINUTE);
		System.out.println("minuto : " + minuto);
		int mont = cal.get(Calendar.MONTH) + 1;
		System.out.println("Mes : " + mont);
		
		
		

	}

}
