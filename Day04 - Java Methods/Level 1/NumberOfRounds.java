import java.util.Scanner;

class NumberOfRounds{
	
	/*Declaring below methods as static will make them accessible inside of class without need of 
	creating an object to call these methods */
	public static double perimeterOfTriangle(double side1, double side2, double side3){
		double sum = side1 + side2 + side3;
		return sum;
	};
	
	public static double calculateRound(double perimeter, double distance){
		return distance/perimeter;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		double distance = 5; //given
		//Taking user input
		System.out.print("Length of first side of Triangle(km) : ");
		double side1 = scanner.nextDouble();
		
		System.out.print("Length of second side of Triangle(km) : ");
		double side2 = scanner.nextDouble();
		
		System.out.print("Length of third side of Triangle(km) : ");
		double side3 = scanner.nextDouble();
		
		//Calculating perimeter of a triangle and storing result in variable
		double sumOfSides = perimeterOfTriangle(side1, side2, side3);
		
		//Calculating number of rounds and storing result in variable
		double numberOfRounds = calculateRound(sumOfSides, distance);
		
		//Displaying results 
		System.out.print("Number of rounds: " + numberOfRounds);
		//closing scanner object
		scanner.close();
	}
}