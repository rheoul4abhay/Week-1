import java.util.Scanner;

class SpringSeason{
	
	public boolean checkForSpring(int month, int day){
		if((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) return true;
		return false;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//creating object of this class to access the method to check the number
		SpringSeason springSeason = new SpringSeason();
		
		//Taking user input
		System.out.print("Enter Month: ");
		int month = scanner.nextInt();
		
		System.out.print("Enter Day: ");
		int day = scanner.nextInt();
		
		//checking if it is postive negative or zero
		boolean isSpring = springSeason.checkForSpring(month, day);
		
		//Displaying results:
		if(isSpring) System.out.print("It's a spring season. ");
		else System.out.print("Not a spring season");

		//closing scanner object
		scanner.close();
	}
}