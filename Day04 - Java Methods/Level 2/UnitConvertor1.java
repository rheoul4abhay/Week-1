import java.util.Scanner;

class UnitConvertor1{
	
	public static double convertKmToMiles(double km){
		double kmTomiles = 0.621371;
		return km * kmTomiles;
	}
	
	public static double convertMilesToKm(double miles){
		double milesTokm = 1.60934;
		return miles * milesTokm;
	}	
	
	public static double convertMetersToFeet(double meters){
		double metersTofeet = 3.28084;
		return meters * metersTofeet;
	}	
	
	public static double convertFeetToMeters(double feet){
		double feetToMeters = 0.3048;
		return feet * feetToMeters;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter distance in Kilometers : ");
		double kilometers = scanner.nextDouble();
		
		System.out.print("Enter distance in Miles : ");
		double miles = scanner.nextDouble();
		
		System.out.print("Enter distance in Meters : ");
		double meters = scanner.nextDouble();
		
		System.out.print("Enter distance in Feet : ");
		double feet = scanner.nextDouble();
		
		System.out.print("\n"+ kilometers + " km is " + convertKmToMiles(kilometers) + " in miles.");
		System.out.print("\n"+ miles + " miles is " + convertMilesToKm(miles) + " in kilometers.");
		System.out.print("\n"+ meters + " meters is " + convertMetersToFeet(meters) + " in feets.");
		System.out.print("\n"+ feet + " feet is " + convertFeetToMeters(feet) + " in meters.");
		
		//closing scanner object
		scanner.close();
	}
}