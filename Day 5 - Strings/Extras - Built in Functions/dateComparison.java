import java.util.*;
import java.time.*;

public class dateComparison {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first date (yyyy-MM-dd): ");
		String date1 = sc.nextLine();

		System.out.println("Enter the second date (yyyy-MM-dd): ");
		String date2 = sc.nextLine();

		LocalDate localDate1 = LocalDate.parse(date1);
		LocalDate localDate2 = LocalDate.parse(date2);

		if (localDate1.isAfter(localDate2)) {
			System.out.println("The first date is after the second date");
		} else if (localDate1.isBefore(localDate2)) {
			System.out.println("The first date is before the second date");
		} else {
			System.out.println("The first date is the same as the second date");
		}

		sc.close();

	}
}