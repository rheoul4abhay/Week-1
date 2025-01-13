import java.util.Scanner;

class NumberChecker1{
	
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
	
	public static boolean isDuckNumber(int number){
		int[] digits = storeDigitsInArray(number);
		for(int digit: digits){
			if(digit != 0) return true;
		}
		return false;
	}
	
	public static boolean isArmstrongNumber(int number){
		int digitsCount = countNumberOfDigits(number);
		int[] digits = storeDigitsInArray(number);
		
		int sum = 0;
		for(int digit: digits){
			sum += Math.pow(digit, digitsCount);
		}
		
		if(sum == number){
			return true;
		}
		return false;
	}
	
	public static void largestAndSecondLargestNumbers(int number){
		
		int[] largestAndSecondLargest = new int[2];
		int digitsCount = countNumberOfDigits(number);
		int[] digits = storeDigitsInArray(number);
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int digit: digits){
			if(digit > largest){
				secondLargest = largest;
				largest = digit;
			}
			else if(digit > secondLargest && digit != largest){
				secondLargest = digit;
			}
		}
		System.out.print("\nLargest Number : " + largest);
		System.out.print("\nSecond Largest Number : " + secondLargest);
	}
	
	public static void smallestAndSecondSmallestNumbers(int number){
		
		int[] smallestAndSecondSmallest = new int[2];
		int digitsCount = countNumberOfDigits(number);
		int[] digits = storeDigitsInArray(number);
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int digit: digits){
			if(digit < smallest){
				secondSmallest = smallest;
				smallest = digit;
			}
			else if(digit < secondSmallest && digit != smallest){
				secondSmallest = digit;
			}
		}
		System.out.print("\nSmallest Number : " + smallest);
		System.out.print("\nSecond Smallest Number : " + secondSmallest);
	}
	
	public static void main(String[] args){
		//Creating scanner object from Scanner utility class
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		
		//Displaying results
		System.out.print("\nDigits count : " + countNumberOfDigits(number));
		System.out.print("\nIs a duck number ? " + isDuckNumber(number));
		System.out.print("\nIs an armstrong number ? " + isArmstrongNumber(number));
		largestAndSecondLargestNumbers(number);
		smallestAndSecondSmallestNumbers(number);
		
		//closing scanner object
		scanner.close();
	}
}