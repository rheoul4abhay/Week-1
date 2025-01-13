import java.util.Scanner;

class ChocolatesDistribution{
	
	public static int[] findNumberOfChocolates(int num1, int num2){
		//creating an array of size 2 which stores quotient and remainder in order
		int[] numArray = new int[2];
		
		numArray[0] = num1/num2; //quotient
		numArray[1] = num1%num2; //remainder
		
		return numArray; 
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter number of chocolates: ");
		int numberOfChocolates = scanner.nextInt();
		
		System.out.print("Enter number of students: ");
		int numberOfStudents = scanner.nextInt();
		
		//To find quotient and remainder using method and storing them in results array respectively
		int[] results = findNumberOfChocolates(numberOfChocolates, numberOfStudents);

		//Displaying results 
		System.out.print("\nNumber of chocolates per student : " + results[0]);
		System.out.print("\nNumber of remaining chocolates : " + results[1]);
		
		//closing scanner object
		scanner.close();
	}
}