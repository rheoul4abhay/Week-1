import java.util.Scanner;

class PositiveNegativeOrZero{
	
	public int isPositiveNegativeOrZero(int number){
		if(number > 0) return 1;
		else if(number < 0) return -1;
		return 0;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//creating object of this class to access the method to check the number
		PositiveNegativeOrZero positiveNegativeOrZero = new PositiveNegativeOrZero();
		
		//Taking user input
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		System.out.print("\n1-> Positive \n0-> Zero\n-1-> Negative\n");
		
		//checking if it is postive negative or zero
		int result = positiveNegativeOrZero.isPositiveNegativeOrZero(number);
		
		//Displaying results:
		System.out.println("Result: " + result);
		
		//closing scanner object
		scanner.close();
	}
}