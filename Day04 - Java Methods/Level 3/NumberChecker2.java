import java.util.Scanner;

class NumberChecker2{
	
	public static int countNumberOfDigits(int number){
		int count = 0;
		while(number > 0){
			count++;
			number /= 10;
		}
		return count;
	}
	
	public static int[] storeDigitsInArray(int number){
		
		int digitsCount = countNumberOfDigits(number);
		int[] digits = new int[digitsCount];
		int index = 0;
		int temp = number;
		
		for(int i = 0;i < digitsCount; i++){
			digits[digitsCount-1-i] = temp % 10;
			temp /= 10;
		}
		return digits;
	}
	
	public static int sumOfDigits(int number){
		
		int[] digits = storeDigitsInArray(number);
		int sum = 0;
		for(int digit: digits){
			sum += digit;
		}
		return sum;
	}
	
	public static int sumOfSquaresOfDigits(int number){
		
		int[] digits = storeDigitsInArray(number);
		int sum = 0;
		for(int digit: digits){
			sum += Math.pow(digit, 2);
		}
		return sum;
	}
	
	public static boolean isHarshadNumber(int number){
		
		int digitsSum = sumOfDigits(number);
		if(number % digitsSum == 0){
			return true;
		}
		return false;
	}
	
	public static int[][] findFreqencyOfEachDigit(int number){
		
		int[] digits = storeDigitsInArray(number);
		int[][] frequencyMatrix = new int[digits.length][2];
		
		for(int i = 0;i < digits.length;i++){
			int frequency = 0;
			for(int j = 0;j < digits.length;j++){
				if(digits[j] == digits[i]) frequency++;
			}
			frequencyMatrix[i][0] = digits[i];
			frequencyMatrix[i][1] = frequency;
		}
		return frequencyMatrix;
	}
	
	public static void print2DMatrix(int[][] matrix2D){
		for(int i = 0; i < matrix2D.length;i++){
			System.out.println();
			for(int j = 0;j < matrix2D[0].length;j++){
				System.out.print(matrix2D[i][j] + " ");
			}
		}
	}
	public static void main(String[] args){
		//Creating scanner object from Scanner utility class
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		
		//Displaying results
		System.out.print("\nDigits count : " + countNumberOfDigits(number));
		System.out.print("\nSum of Digits : " + sumOfDigits(number));
		System.out.print("\nSum of Squares of digits : " + sumOfSquaresOfDigits(number));
		System.out.print("\nIs a Harshad Number ? " + isHarshadNumber(number));
		System.out.println();
		System.out.print("\nFrequency of each digit in number : ");
		print2DMatrix(findFreqencyOfEachDigit(number));
		//closing scanner object
		scanner.close();
	}
}