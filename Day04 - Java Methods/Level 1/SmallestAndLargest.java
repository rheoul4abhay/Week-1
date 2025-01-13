import java.util.Scanner;

class SmallestAndLargest{
	
	public static int[] findSmallestAndLargest(int num1, int num2, int num3){
		//creating an array of size 2 which stores smallest and largest of the 3 numbers in order
		int[] numArray = new int[2];
		
		//Using conditionals to check for smallest and largest among the three numbers
		if(num1 > num2 && num1 > num3) numArray[1] = num1;
		else if(num2 > num1 && num2 > num3) numArray[1] = num2;
		else numArray[1] = num3;
		
		if(num1 < num2 && num1 < num3) numArray[0] = num1;
		else if(num2 < num1 && num2 < num3) numArray[0] = num2;
		else numArray[0] = num3;
		
		return numArray;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter number 1: ");
		int number1 = scanner.nextInt();
		
		System.out.print("Enter number 2: ");
		int number2 = scanner.nextInt();
		
		System.out.print("Enter number 3: ");
		int number3 = scanner.nextInt();
		
		//getting the smallest and largest of the 3 numbers
		int[] results = findSmallestAndLargest(number1, number2, number3);

		//Displaying results 
		System.out.print("\nSmallest: " + results[0]);
		System.out.print("\nLargest: " + results[1]);
		
		//closing scanner object
		scanner.close();
	}
}