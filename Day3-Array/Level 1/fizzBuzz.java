import java.util.Scanner;

class fizzBuzz{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number = scanner.nextInt();
		while(number <= 0){			
			System.out.println("Enter a positive number: ");
			number = scanner.nextInt();
		}
		
		String[] results = new String[number];
		int index = 0;
		
		for(int i = 1;i <= number;i++){
			if((i%3 == 0) && (i%5 == 0)){
				results[index] = "FizzBuzz";
			}
			else if(i%3 == 0){
				results[index] = "Fizz";
			}
			else if(i%5 == 0){
				results[index] = "Buzz";
			}
			else{
				results[index] = Integer.toString(i);
			}
			index++;
		}
		
		for(int i = 0;i < results.length;i++){
			System.out.println("Position " + (i+1) + " = " + results[i]);
		}
		scanner.close();
	}
}