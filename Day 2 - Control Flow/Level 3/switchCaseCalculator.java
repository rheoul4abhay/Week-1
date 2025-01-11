import java.util.Scanner;

class switchCaseCalculator{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Operations: ");
		System.out.println("\n+");
		System.out.println("-");
		System.out.println("*");
 		System.out.println("/");

		System.out.print("Enter first number: ");
		double first = scanner.nextDouble();
		
		System.out.print("Enter second number: ");
		double second = scanner.nextDouble();
		
		System.out.print("Enter operation to perform : ");
		String op = scanner.next();
		
		switch(op){
			case "+":
				System.out.print("Addition: " + (first+second));
				break;
			case "-":
				System.out.print("Subtraction: " + (first-second));
				break;
			case "*":
				System.out.print("Multiplication: " + (first*second));
				break;
			case "/":
				System.out.print("Division: " + (first/second));
				break;
			default:
				System.out.print("Invalid Operator. ");
		}
		scanner.close();
	}
}