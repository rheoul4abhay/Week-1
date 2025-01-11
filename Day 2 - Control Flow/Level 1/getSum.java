import java.util.Scanner;

class getSum{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number to be added : ");
		double input = scanner.nextDouble();
		double total = input;

		while(input != 0){
			System.out.print("Enter the number to be added : ");
			input = scanner.nextDouble();
			total += input;
		}
		System.out.print("Total : " + total);
		scanner.close();
	}
}