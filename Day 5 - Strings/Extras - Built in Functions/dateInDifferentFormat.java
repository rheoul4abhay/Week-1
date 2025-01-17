import java.util.*;
import java.time.*;

public class dateInDifferentFormat {

    public static void main(String[] args) {
		
		// TODO
		
		Date currentDate = new Date();
		System.out.println("current date: "+currentDate);
		
		Instant nowUtc = Instant.now();
		ZoneId asiaSingapore = ZoneId.of("Asia/Singapore");
		ZonedDateTime nowAsiaSingapore = ZonedDateTime.ofInstant(nowUtc, asiaSingapore);
		
		System.out.println("now utc: "+nowUtc);
		System.out.println("asiaSingapore: "+asiaSingapore);
		System.out.println("nowAsiaSingapore: "+nowAsiaSingapore);
		
    }
}