import java.util.Scanner;

class areaTriangle{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter base :");
		double base = scanner.nextDouble();

		System.out.print("Enter height :");
		double height = scanner.nextDouble();

		System.out.println("Area of triangle is : " + (base*height)/2);
		scanner.close();
	}
}