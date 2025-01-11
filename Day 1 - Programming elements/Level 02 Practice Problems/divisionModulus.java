import java.util.Scanner;

class divisionModulus{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number1: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Enter number2: ");
		double n2 = scanner.nextDouble();

		System.out.println("The quotient and remainder of two numbers " + n1 + " and " + n2 + " are " + n1/n2 +
				   " and " + n1%n2 + " respectively."); 	
		scanner.close();		
	}
}