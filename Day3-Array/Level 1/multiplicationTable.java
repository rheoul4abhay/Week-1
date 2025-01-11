import java.util.Scanner;

class multiplicationTable{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int[] results = new int[10];
		
		for(int i = 1;i <= results.length;i++){
			results[i-1] = i*number;
		}
	
		for(int i = 0;i < results.length;i++){
			System.out.println(number + " * " + (i+1) + " = " + results[i]);
		}
		scanner.close();
	}
}