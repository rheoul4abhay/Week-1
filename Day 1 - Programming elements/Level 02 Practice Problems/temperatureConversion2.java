import java.util.Scanner;

class temperatureConversion2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Temperature in fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double celsiusResult = (fahrenheit-32) * 5/9;
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius.");
		scanner.close();
	}
}