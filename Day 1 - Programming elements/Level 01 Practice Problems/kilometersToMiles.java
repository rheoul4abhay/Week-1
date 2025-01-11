import java.util.Scanner;

class kilometersToMiles{
	public static void main(String[] args){
 		
		System.out.print("Enter Distance in km: ");
		Scanner scanner = new Scanner(System.in);
		double km = scanner.nextDouble();
		
		double miles = km/1.6;
		System.out.println("The total miles is " + miles + " mile for the given "
		+ km + " km");
		//closing scanner object is necessary
		scanner.close();
	}
}
