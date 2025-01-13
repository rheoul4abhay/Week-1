import java.util.Scanner;

class LeapYear{
	
	public static boolean isALeapYear(int year){
		if(year >= 1582){
			if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter year : ");
		int year = scanner.nextInt();
		
		while(year < 1582){		
		System.out.print("\nEnter an year greater than or equal to 1582 : ");
		year = scanner.nextInt();
		}
		//Using isALeapYear method to get the results
		boolean isLeapYear = isALeapYear(year);
		
		//Displaying results
		System.out.print("\nIs a leap year? " + isLeapYear);
		
		//closing scanner object
		scanner.close();
	}
}