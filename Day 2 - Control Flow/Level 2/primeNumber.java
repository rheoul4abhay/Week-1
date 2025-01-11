import java.util.Scanner;

class primeNumber{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		boolean isPrime = false;
		
		int i;
		for(i = 2;i < number;i++){
			if(number % 2 == 0){
				break;
			}
		}
		if(i == number){
			isPrime = true;
		}
		System.out.print("Is a prime number : " + isPrime);	
		scanner.close();
	}
}