import java.util.Scanner;

class abundantNumber{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int temp = number;

		boolean isAbundantNumber = false;
		int sum = 0;

		for(int i = 1; i < number; i++){
			if(number % i == 0){
				sum += i;
			}
		}
		if(sum > temp){
			isAbundantNumber = true;
		}
		System.out.print("Is an abundant Number : " + isAbundantNumber);
		scanner.close();
	}
}