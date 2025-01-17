import java.util.*;
import java.time.*;

public class dateArithmetic {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = sc.nextInt();

		System.out.print("Enter month: ");
		int month = sc.nextInt();

		System.out.print("Enter day: ");
		int day = sc.nextInt();

		LocalDate currentDate = LocalDate.of(year, month, day);
		System.out.println("Current Date: " + currentDate);

		currentDate = currentDate.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println("New Date after adding 7 days, 1 month and 2 years: " + currentDate);

		currentDate = currentDate.minusWeeks(3);
		System.out.println("New Date after subtracting 3 weeks: " + currentDate);

		sc.close();
	}
}