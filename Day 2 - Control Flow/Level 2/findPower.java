import java.util.Scanner;

class findPower{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.print("Enter power: ");
		int power = scanner.nextInt();
		
		int result = 1;
		for(int i = 1; i <= power;i++){
			result = result * number;
		}
		System.out.print(number + " raised to power " + power + " is : " + result);	
		scanner.close();
	}
}