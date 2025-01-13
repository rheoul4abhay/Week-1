import java.util.Scanner;

class DisplayCalender{
	
	public static String findMonth(int monthNumber){
	
	String[] months = {"January", "February", "March", "April",
					  "May", "June", "July", "August",
					  "September", "October", "November", "December"};
	return months[monthNumber-1];
	}
	
	public static boolean isALeapYear(int year){
		if((year % 4 == 0 && year%100 != 0) || (year%400 == 0)) return true;
		return false;
	}
	
	public static int numberOfDaysInMonth(int year, int month){
		
		int[] daysCountByMonths;
		
		if(isALeapYear(year)){
			daysCountByMonths = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}
		else {
			daysCountByMonths = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}
		return daysCountByMonths[month-1];
	}
	
	public static int calculateFirstDayOfTheMonth(int year, int month){
		
		int date = 1;
		int y0 = year - (14-month)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = month + 12 * ((14-month)/12)-2;
		int d0 = (date + x + (31*m0)/12) % 7;
		
		return d0;
	}
	
	public static void displayCalender(int year, int month){
		
		System.out.print("\n" + findMonth(month) + " " + year);
		String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		//To display days of a week in calender
		System.out.println();
		for(String day: daysOfWeek){
			System.out.print(day + " ");
		}			
		
		int totalNumberOfDays = numberOfDaysInMonth(year, month);
		int firstDayOfTheMonth = calculateFirstDayOfTheMonth(year, month);
		
		//For indentation upto the first day of the month
		
		System.out.println();
		for(int i = 0;i < firstDayOfTheMonth;i++){
			System.out.print("    ");
		}
		
		//To print dates in the calender
		int date = 1;
		int dateIndex = firstDayOfTheMonth;
		boolean hasTraversed = false;
		
		while(date < totalNumberOfDays){		
			for(int j = 7-dateIndex;j != 0;j--){			
				if(date > totalNumberOfDays){
					hasTraversed = true;
					break;
				}
				System.out.printf("%3d", date);
				System.out.print(" ");
				date++;
			}
			if(hasTraversed) break;
			dateIndex = 0;
			System.out.println();
		}
	}
	public static void main(String args[]){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		
		System.out.print("Enter month(1 to 12) -> ");
		int month = scanner.nextInt();
		
		System.out.print("Enter year -> ");
		int year = scanner.nextInt();
						
		//Displaying calender
		displayCalender(year, month);
		//closing scanner object
		scanner.close();
	}
}