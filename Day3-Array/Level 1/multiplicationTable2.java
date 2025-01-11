import java.util.Scanner;

class multiplicationTable2{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int[] results = new int[4];
		
		for(int i = 6;i <= 9;i++){
			results[i-6] = i*number;
		}
	
		for(int i = 0;i < results.length;i++){
			System.out.println(number + " * " + (i+6) + " = " + results[i]);
		}
		scanner.close();
	}
}