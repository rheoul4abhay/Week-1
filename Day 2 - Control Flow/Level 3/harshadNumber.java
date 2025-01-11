import java.util.Scanner;

class harshadNumber{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int temp = number;

		boolean isHarshadNumber = false;
		int sum = 0;

		while(number != 0){
			int digit = number%10;
			sum += digit;
			number /= 10;
		}
		if(temp%sum == 0){
			isHarshadNumber = true;
		}
		System.out.print("Is a Harshad Number : " + isHarshadNumber);
		scanner.close();
	}
}