import java.util.Scanner;

class naturalNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		
		if(number < 0){
			System.out.print("The number " + number + " is not a natural number.");
		}
		else{
			System.out.print("The sum of " + number + " natural numbers is " + 
					  number*(number+1)/2);
		}
		scanner.close();
	}
}