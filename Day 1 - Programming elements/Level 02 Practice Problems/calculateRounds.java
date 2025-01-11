import java.util.Scanner;

class calculateRounds{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sides of triangle: ");
		
		double distance = 5; //given

		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();
		
		double perimeterTriangle = side1 + side2 + side3;

		System.out.println("The total number of rounds the athlete will run is " + (perimeterTriangle/distance));;
		scanner.close();
	}
}
