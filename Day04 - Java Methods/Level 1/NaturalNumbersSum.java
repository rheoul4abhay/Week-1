import java.util.Scanner;

class NaturalNumbersSum{
	
	public int findSum(int number){
		int sum = 0;
		while(number != 0){
			sum += number;
			number--;
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//creating object of class
		NaturalNumbersSum naturalNumbersSum = new NaturalNumbersSum();
		
		//Taking user input
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		//finding sum using the method and storing result in a variable
		int sum = naturalNumbersSum.findSum(number);
		
		//Displaying results
		System.out.print("Sum of first " + number + " natural numbers is " +
						sum);
		scanner.close();
	}
}