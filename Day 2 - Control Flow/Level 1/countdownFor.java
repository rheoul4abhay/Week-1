import java.util.Scanner;

class countdownFor{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the counter: ");
		int input = scanner.nextInt();
		for(int i = input; i > 0; i--){
			System.out.println(i);
		}
		scanner.close();
	}
}