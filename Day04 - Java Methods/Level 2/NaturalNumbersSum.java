import java.util.Scanner;

class NaturalNumbersSum{
	
	public static int recursiveSum(int number){
		if(number == 0) return 0;
		else return number + recursiveSum(number-1);
	}
	
	public static int formulaBasedSum(int number){
		return (number*(number+1))/2;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		//Calculating sum with 2 different methods and storing results into variables
		int recursionSum = recursiveSum(number);
		int formulaSum = formulaBasedSum(number);
		
		//Displaying results
		System.out.print("\nSum of " + number + " natural numbers with recursion -> " + recursionSum);
		System.out.print("\nSum of " + number + " natural numbers with formula -> " + formulaSum);
		
		if(recursionSum == formulaSum) System.out.print("\nResults matched!");
		
		//closing scanner object
		scanner.close();
	}
}