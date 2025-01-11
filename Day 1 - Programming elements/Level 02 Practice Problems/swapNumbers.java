import java.util.Scanner;

class swapNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First Number : ");
		int num1 = scanner.nextInt();

		System.out.print("Second Number : ");
		int num2 = scanner.nextInt();

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("The swapped numbers are " + num1 + " and " + num2);
		scanner.close();
	}
}