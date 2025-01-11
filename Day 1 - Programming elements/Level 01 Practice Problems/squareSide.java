import java.util.Scanner;

class squareSide{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter perimeter of square: ");
		double perimeter = scanner.nextDouble();
		
		double sideLength = perimeter/4;

		System.out.println("The length of side of square is " + sideLength + " whose perimeter is " + perimeter);
		scanner.close();
	}
}