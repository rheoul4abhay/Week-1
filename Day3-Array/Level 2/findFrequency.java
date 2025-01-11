import java.util.Scanner;

class findFrequency{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int temp = number;
		int countDigits = 0;
		
		int[] frequencyDigits = new int[10];
		//To count the number of digits
		while(temp != 0){
			int digit = temp%10;
			frequencyDigits[digit]++;
			temp /= 10;
			countDigits++;
		}
		
		int[] digits = new int[countDigits];
		int index = 0;
		while(number != 0){
			digits[index++] = number % 10;
			number /= 10;
		}
		
		for(int i = 0;i < countDigits;i++){
			System.out.print("\nFrequency of " + digits[i] + " : " + frequencyDigits[digits[i]]);
		}
		scanner.close();
	}
}