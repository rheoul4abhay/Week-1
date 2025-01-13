import java.util.Scanner;

class NumberChecker4{
	
	public static boolean isAPrimeNumber(int number){
		for(int i = 2; i < number;i++){
			if(number % i == 0) return false;
		}
		return true;
	}
	
	//To check for neon number we need below 3 helper methods
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
	
	public static boolean isANeonNumber(int number){
		
		if(sumOfDigits((int)((Math.pow(number, 2)))) == number){
			return true;
		}
		return false;
	}
	
	public static int productOfDigits(int number){
		
		int[] digits = storeDigitsInArray(number);
		int product = 1;
		
		for(int digit: digits){
			product *= digit;
		}
		return product;
	}
	
	public static boolean isASpyNumber(int number){
		
		if(sumOfDigits(number) == productOfDigits(number)) return true;
		return false;
	}
	
	public static boolean isAutomorphicNumber(int number){
		
		int[] numberDigitArray = storeDigitsInArray(number);
		int[] squaredNumberDigitArray = storeDigitsInArray((int)(Math.pow(number, 2)));
		
		int pointer1 = 0;
		int pointer2 = squaredNumberDigitArray.length-numberDigitArray.length;
		
		while(pointer1 != numberDigitArray.length ||
			pointer2 != squaredNumberDigitArray.length){
			if(numberDigitArray[pointer1] != squaredNumberDigitArray[pointer2]){
				return false;
			}
			pointer1++;
			pointer2++;
		}
		return true;
	}
	
	public static boolean isABuzzNumber(int number){
	
	int[] digits = storeDigitsInArray(number);
	if(number % 7 == 0 || digits[digits.length-1] == 7){
		return true;
	}
		return false;
	}
	
	public static void main(String[] args){
		//Creating scanner object from Scanner utility class
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		
		//Displaying results
		System.out.print("\nIs given number a prime number ? " + isAPrimeNumber(number));
		System.out.print("\nIs given number a neon number ? " + isANeonNumber(number));
		System.out.print("\nIs given number a spy number ? " + isASpyNumber(number));
		System.out.print("\nIs given number a automorphic number ? " + isAutomorphicNumber(number));
		System.out.print("\nIs given number a buzz number ? " + isABuzzNumber(number));
	
		//closing scanner object
		scanner.close();
	}
}