import java.util.Scanner;

class UnitConvertor2{
	
	public static double convertYardsToFeet(double yards){
		double yardsToFeet = 3;
		return yards * yardsToFeet;
	}
	
	public static double convertFeetsToYards(double feets){
		double feetToYards = 0.333333;
		return feets * feetToYards;
	}	
	
	public static double convertMetersToInches(double meters){
		double metersToInches = 39.3701;
		return meters * metersToInches;
	}	
	
	public static double convertInchesToMeters(double inches){
		double inchesToMeters = 0.0254;
		return inches * inchesToMeters;
	}
	
	public static double convertInchesToCentimeters(double inches){
		double inchesToCentimeters = 2.54;
		return inches * inchesToCentimeters;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter distance in Yards : ");
		double yards = scanner.nextDouble();
		
		System.out.print("Enter distance in Feet : ");
		double feet = scanner.nextDouble();
		
		System.out.print("Enter distance in Meters : ");
		double meters = scanner.nextDouble();
		
		System.out.print("Enter distance in Inches : ");
		double inches = scanner.nextDouble();
		
		System.out.print("Enter distance in Centimeters : ");
		double centimeters = scanner.nextDouble();
		
		System.out.print("\n"+ yards + " yards is " + convertYardsToFeet(yards) + " in feet.");
		System.out.print("\n"+ feet + " feet is " + convertFeetsToYards(feet) + " in yards.");
		System.out.print("\n"+ meters + " meters is " + convertMetersToInches(meters) + " in inches.");
		System.out.print("\n"+ inches + " inches is " + convertInchesToMeters(inches) + " in meters.");
		System.out.print("\n"+ inches + " inches is " + convertInchesToCentimeters(inches) + " in centimeters.");
		
		//closing scanner object
		scanner.close();
	}
}