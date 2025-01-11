import java.util.Scanner;

class countdownWhile{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the counter: ");
		int input = scanner.nextInt();
		while(input != 0){
			System.out.println(input);
			input--;
		}
		scanner.close();
	}
}