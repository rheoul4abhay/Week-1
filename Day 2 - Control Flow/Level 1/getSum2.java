import java.util.Scanner;

class getSum2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number to be added : ");
		double input = scanner.nextDouble();
		double total = input;

		while(true){
			System.out.print("Enter the number to be added : ");
			input = scanner.nextDouble();
			if(input <= 0) break;
			total += input;
		}
		System.out.print("Total : " + total);
		scanner.close();
	}
}