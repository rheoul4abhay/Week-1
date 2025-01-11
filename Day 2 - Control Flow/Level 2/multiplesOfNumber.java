import java.util.Scanner;

class multiplesOfNumber{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Its multiples are : ");

		for(int i = 100;i >= 1;i--){
			if(number % i == 0){
				System.out.println(i);
			}
		}
		scanner.close();
	}
}