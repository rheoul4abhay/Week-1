import java.util.Scanner;
import java.lang.Math;

class armstrongNumber{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int temp = number;

		int sum = 0;
		boolean isArmstrong = false;
		
		while(number != 0){
			int digit = number%10;
			sum += Math.pow(digit, 3);
			number /= 10;
		}

		if(sum == temp){
			isArmstrong = true;
		}
		System.out.print("Is Armstrong number ? " + isArmstrong);
		scanner.close();
	}
}