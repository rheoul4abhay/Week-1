import java.util.Scanner;

class UnitConvertor3{
	
	public static double convertFahrenheitToCelcius(double fahrenheit){
		return (fahrenheit - 32) * 5/9;
	}
	
	public static double convertCelsiusToFahrenheit(double celsius){
		return (celsius * 9/5) + 32;
	}	
	
	public static double convertPoundsToKilograms(double pounds){
		double poundsToKilogram = 0.453592;
		return pounds * poundsToKilogram;
	}	
	
	public static double convertKilogramsToPounds(double kilograms){
		double kilogramsToPounds = 2.20462;
		return kilograms * kilogramsToPounds;
	}
	
	public static double convertGallonsToLiters(double gallons){
		double gallonToLiters = 3.78541;
		return gallons * gallonToLiters;
	}

	public static double convertLitersToGallons(double liters){
		double litersToGallons = 0.264172;
		return liters * litersToGallons;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter temperature in fahrenheit : ");
		double fahrenheit = scanner.nextDouble();
		
		System.out.print("Enter temperature in celsius : ");
		double celsius = scanner.nextDouble();
		
		System.out.print("Enter weight in pounds : ");
		double pounds = scanner.nextDouble();
		
		System.out.print("Enter weight in kilograms : ");
		double kilograms = scanner.nextDouble();
		
		System.out.print("Enter quantity in gallons : ");
		double gallons = scanner.nextDouble();		
		
		System.out.print("Enter quantity in liters : ");
		double liters = scanner.nextDouble();
		
		//Displaying results
		System.out.print("\n"+ fahrenheit + " fahrenheit is " + convertFahrenheitToCelcius(fahrenheit) + " in celsius.");
		System.out.print("\n"+ celsius + " celsius is " + convertCelsiusToFahrenheit(celsius) + " in fahrenheit.");
		System.out.print("\n"+ pounds + " pounds is " + convertPoundsToKilograms(pounds) + " in kilograms.");
		System.out.print("\n"+ kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " in pounds.");
		System.out.print("\n"+ gallons + " gallons is " + convertGallonsToLiters(gallons) + " in liters.");
		System.out.print("\n"+ liters + " liters is " + convertLitersToGallons(liters) + " in gallons.");
		
		//closing scanner object
		scanner.close();
	}
}