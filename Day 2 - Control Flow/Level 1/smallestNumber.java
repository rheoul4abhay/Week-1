import java.util.Scanner;

class smallestNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter num1:");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter num2:");
		int num2 = scanner.nextInt();
		
		System.out.print("Enter num3:");
		int num3 = scanner.nextInt();
		
		System.out.print("Is the first number the smallest? ");
		if((num1 < num2) && (num1 < num3)){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
		scanner.close();
	}
}