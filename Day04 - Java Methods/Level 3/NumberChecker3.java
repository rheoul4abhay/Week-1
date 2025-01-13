import java.util.Scanner;

class NumberChecker3{
	
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
	
	public static int[] reverseDigitsArray(int number){
		
		int[] digits = storeDigitsInArray(number);
		
		//Using two pointer approach
		int left = 0;
		int right = digits.length-1;
		
		while(left != right){
			int temp = digits[left];
			digits[left] = digits[right];
			digits[right] = temp;
			left++;
			right--;
		}
		return digits;
	}
	
	public static boolean areEqualArrays(int[] array1, int[] array2){
		
		int pointerArray1 = 0;
		int pointerArray2 = 0;
		while(pointerArray1 != array1.length || pointerArray2 != array2.length){
			if(array1[pointerArray1] != array2[pointerArray2]) return false;
			pointerArray1++;
			pointerArray2++;
		}
		return true;
	}
	
	public static boolean isAPalindromeNumber(int number){
		
		int[] digitsArray = storeDigitsInArray(number);
		int[] reversedDigitsArray = reverseDigitsArray(number);
		
		if(areEqualArrays(digitsArray, reversedDigitsArray)){
			return true;
		}
		return false;
	}
	
	public static boolean isDuckNumber(int number){
		int[] digits = storeDigitsInArray(number);
		for(int digit: digits){
			if(digit != 0) return true;
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
		System.out.print("\nDigits count : " + countNumberOfDigits(number));
		
		int[] array1 = {1,5,3,5,1};
		int[] array2 = {1,5,3,5,1};
		System.out.print("\nAre Equal Arrays : " + areEqualArrays(array1, array2));
		System.out.print("\nIs given number a palindrome ? " + isAPalindromeNumber(number));
		System.out.print("\nIs a duck number ? " + isDuckNumber(number));

		//closing scanner object
		scanner.close();
	}
}