import java.util.Scanner;

class findFactorial{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = scanner.nextInt();
		int factorial = 1;

		if(number >= 0){
			while(number != 0){
			factorial *= number;
			number--;
			}
			System.out.print("Factorial : " + factorial);
		}
		else{
			System.out.print("Negative number not allowed.");
		}
		scanner.close();
	}
}