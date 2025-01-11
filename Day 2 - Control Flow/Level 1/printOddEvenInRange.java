import java.util.Scanner;

class printOddEvenInRange{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if(number > 0){
			for(int i = 1;i <= number;i++){
				if(i % 2 == 0){
					System.out.println(i + " is even");
				}
				else{
					System.out.println(i + " is odd");
				}
			}
		}
		else{
			System.out.print("Not a natural number");
		}
		scanner.close();
	}
}