import java.util.Scanner;

class naturalNumberSum2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value of n : ");
		int number = scanner.nextInt();
		int sumByFormula = number*(number+1)/2;

		if(number < 0){
			System.out.print("Not a natural number");
		}
		
		int sumByFor = 0;
		for(int i = number; i > 0;i--){
			sumByFor += i;
		}

		if(sumByFormula == sumByFor){
			System.out.print("Result : " + sumByFor);
		}
		scanner.close();
	}
}