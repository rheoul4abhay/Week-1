import java.util.Scanner;

class QuotientRemainder{
	
	public static int[] findQuotientRemainder(int num1, int num2){
		//creating an array of size 2 which stores quotient and remainder in order
		int[] numArray = new int[2];
		
		numArray[0] = num1/num2; //quotient
		numArray[1] = num1%num2; //remainder
		
		return numArray; 
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		
		System.out.print("Enter divisor: ");
		int divisor = scanner.nextInt();
		
		//To find quotient and remainder using method and storing them in results array respectively
		int[] results = findQuotientRemainder(number, divisor);

		//Displaying results 
		System.out.print("\nQuotient: " + results[0]);
		System.out.print("\nRemainder: " + results[1]);
		
		//closing scanner object
		scanner.close();
	}
}