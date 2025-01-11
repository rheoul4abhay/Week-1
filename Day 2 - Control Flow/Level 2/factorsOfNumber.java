import java.util.Scanner;

class factorsOfNumber{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Its factors are : ");

		for(int i = 1;i < number;i++){
			if(number % i == 0){
				System.out.println(i);
			}
		}
		scanner.close();
	}
}