import java.util.Scanner;

class fizzBuzz2{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int counter = 0;
		if(number > 0){
			while(number >= 0){
				if((counter % 3 == 0) && (counter % 5 == 0)){
					System.out.println("FizzBuzz");
				}
				else if(counter % 3 == 0){
					System.out.println("Fizz");
				}
				else if(counter % 5 == 0){
					System.out.println("Buzz");
				}
				else{
					System.out.println(counter);
				}
				number--;
				counter++;
			}
		}
		else{
			System.out.print("Not a positive number.");
		}
		scanner.close();
	}
}