import java.util.Scanner;

class divisibilityBy5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		
		int number = scanner.nextInt();
		System.out.print("Is the number " + number + " divisible by 5? ");
		if(number % 5 == 0){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
		scanner.close();
	}
}