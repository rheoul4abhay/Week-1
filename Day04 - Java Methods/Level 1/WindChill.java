import java.util.Scanner;

class WindChill{
	
	public static double calculateWindChill(double temperature, double windSpeed){
		return  35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter the temperature: ");
		double temperature = scanner.nextDouble();
		
		System.out.print("Enter the windspeed: ");
		double windSpeed = scanner.nextDouble();
		
		//using method to calculate the windChill temperature
		double windChillTemperature = calculateWindChill(temperature, windSpeed);
		
		//Displaying results 
		System.out.print("\nWind chill temperature = " + windChillTemperature);
		
		//closing scanner object
		scanner.close();
	}
}