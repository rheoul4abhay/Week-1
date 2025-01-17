import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class TimeZonesAndZonedDateTime{
	
	public static void main(String[] args){
	Date currentDate = new Date();
	System.out.println("Current date is -> " + currentDate);
	
	ZoneId gmt = ZoneId.of("UTC");
	ZonedDateTime gmtTime = ZonedDateTime.now(gmt);
	
	ZoneId ist = ZoneId.of("Asia/Kolkata");
	ZonedDateTime istTime = ZonedDateTime.now(ist);
	
	ZoneId pst = ZoneId.of("America/Los_Angeles");
	ZonedDateTime pstTime = ZonedDateTime.now(pst);
	
	System.out.println("GMT Time: " + gmtTime.toLocalDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
	System.out.println("IST Time: " + istTime.toLocalDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
	System.out.println("PST Time: " + pstTime.toLocalDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
	}
}