import java.util.Scanner;

class leapYear2{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the year : ");
		
		int year = scanner.nextInt();
		
		//to check if the user enter a valid input
		boolean isValidInput = true;

		if(year < 1582){
			System.out.print("Please Enter an year after 1582");
			isValidInput = false;
		}
		
		if((year % 4 == 0) && ((year%100 == 0 || year%400 == 0))){
			System.out.print("Leap Year");
		}
		else{
			System.out.print("-> Not a Leap Year");
		}
		
		scanner.close();
	}
}