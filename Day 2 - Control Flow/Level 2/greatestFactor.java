import java.util.Scanner;

class greatestFactor{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int greatestFactor = 1;
		for(int i = 1; i < number; i++){
			if(number % i == 0){
				greatestFactor = i;
			}
		}
		System.out.print("Greatest factor is : " + greatestFactor);	
		scanner.close();
	}
}