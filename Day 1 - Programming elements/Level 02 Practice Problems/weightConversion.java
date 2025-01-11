import java.util.Scanner;

class weightConversion{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter weight (in pounds) : ");

		double weightPounds = scanner.nextDouble();
		double weightKilograms = weightPounds/2.2;
			
		System.out.println("The weight of the person in pound is " +
				   weightPounds + " and in Kg is " + weightKilograms);
		scanner.close();
	}
}