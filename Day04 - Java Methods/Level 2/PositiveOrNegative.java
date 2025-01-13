import java.util.Scanner;

class PositiveOrNegative{
	
	public static boolean isPositive(double number){
		if(number > 0) return true;
		return false;
	}
	
	public static boolean isEven(double number){
		if(number % 2 == 0){
			return true;
		}
		return false;
	}
	
	public static String compare(double number1, double number2){
		if(number1 == number2){
			return "First and Last numbers are equal";
		}
		else if(number1 > number2){
			return "First number is greater and last number is smaller";
		}
		else{
			return "Last number is greater and first is smaller";
		}
	}
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		int numberCount = 5;
		
		//Creating suitable array
		double[] numbers = new double[numberCount];
		
		//Taking user input of the numbers
		System.out.print("Enter the " + numberCount + " numbers below\n");
		
		//Storing each number in the numbers array
		for(int i = 0;i < numberCount; i++){
			System.out.print("\nEnter the number " + (i+1) + " : ");
			numbers[i] = scanner.nextDouble();
		}
		
		System.out.println();
		
		for(int i = 0;i < numbers.length;i++){
			System.out.println();
			if(numbers[i] == 0){
				System.out.print("Number " + numbers[i] + " is neither Positive nor Negative.");
			}
			else if(isPositive(numbers[i])){
				if(isEven(numbers[i])){
					System.out.print("Number " + numbers[i] + " is Positive and Even.");
				}
				else System.out.print("Number " + numbers[i] + " is Positive and Odd.");
			}
			else System.out.print("Number " + numbers[i] + " is Negative.");
		}
		System.out.println();
		//Displaying comparision results
		System.out.print("\nFirst and Last Digits comparision results : \n");
		System.out.print(compare(numbers[0], numbers[numberCount-1]));
		
		//closing scanner object
		scanner.close();
	}
}