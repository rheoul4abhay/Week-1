import java.util.Scanner;

class temperatureConversion{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Temperature in celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheitResult = (celsius * 9/5) + 32;
		System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
		scanner.close();
	}
}