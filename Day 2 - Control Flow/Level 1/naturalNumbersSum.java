import java.util.Scanner;

class naturalNumberSum{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value of n : ");
		int number = scanner.nextInt();
		int sumByFormula = number*(number+1)/2;

		if(number < 0){
			System.out.print("Not a natural number");
		}
		
		int sumByWhile = 0;
		while(number != 0){
			sumByWhile += number;
			number--;
		}

		if(sumByFormula == sumByWhile){
			System.out.print("Result : " + sumByWhile);
		}
		scanner.close();
	}
}