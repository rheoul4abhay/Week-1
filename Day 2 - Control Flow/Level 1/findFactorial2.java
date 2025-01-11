import java.util.Scanner;

class findFactorial2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = scanner.nextInt();
		int factorial = 1;

		if(number > 0){
			for(int i = number;i > 0;i--){
			factorial *= i;
			}
			System.out.print("Factorial : " + factorial);
		}
		else{
			System.out.print("Not a natural number. ");
		}
		scanner.close();
	}
}