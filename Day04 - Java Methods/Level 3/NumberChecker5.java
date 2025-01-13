import java.util.Scanner;

class NumberChecker5{
	
	public static int factorsCount(int number){
		int count = 0;
		
		for(int i = 1;i < number;i++){
			if(number % i == 0) count++;
		}
		return count;
	}
	
	public static int[] findFactors(int number){
		int[] factors = new int[factorsCount(number)];
		
		int index = 0;
		for(int i = 1;i < number;i++){
			if(number % i == 0){
				factors[index++] = i;
			}
		}
		return factors;
	}
	
	public static int greatestFactor(int number){
		
		int[] factors = findFactors(number);
		int greatestFactor = factors[0];
		
		for(int i = 0;i < factors.length;i++){
			greatestFactor = Math.max(factors[i], greatestFactor);
		}
		return greatestFactor;
	}
	
	public static int findSumOfFactors(int number){
		
		int sum = 0;
		int[] factors = findFactors(number);
		
		for(int factor: factors) sum += factor;
		return sum;
	}
	
	public static int findProductOfFactors(int number){
		
		int product = 1;
		int[] factors = findFactors(number);
		
		for(int factor: factors) product *= factor;
		return product;
	}
	
	public static int findProductOfCubesOfFactors(int number){
		
		int product = 1;
		int[] factors = findFactors(number);
		
		for(int factor: factors) product *= Math.pow(factor, 3);
		return product;
	}
	
	public static boolean IsPerfectNumber(int number){
		
		if(findSumOfFactors(number) == number) return true;
		return false;
	}
	
	public static boolean IsAbundantNumber(int number){
		
		if(findSumOfFactors(number) > number) return true;
		return false;
	}
	
	public static boolean IsDeficientNumber(int number){
		
		if(findSumOfFactors(number) < number) return true;
		return false;
	}
	
	public static int findFactorial(int number){
		
		if(number == 1) return 1;
		return number * findFactorial(number-1);
	}
	
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
	
	public static boolean IsStrongNumber(int number){
		
		int[] digits = storeDigitsInArray(number);
		
		int sumOfFactorials = 0;
		for(int i = 0;i < digits.length;i++){
			sumOfFactorials += findFactorial(digits[i]);
		}
		
		if(sumOfFactorials == number){
			return true;
		}
		return false;
	}
	
	public static void printArray(int[] array){
		for(int arr: array){
			System.out.print(arr + " ");
		}
	}
	public static void main(String[] args){
		//Creating scanner object from Scanner utility class
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		
		//Displaying results
		System.out.print("\nFactors of " + number + " -> ");
		printArray(findFactors(number));
		System.out.print("\nGreatest among all factors -> " + greatestFactor(number));
		System.out.print("\nSum of factors -> " + findSumOfFactors(number));
		System.out.print("\nProduct of factors -> " + findProductOfFactors(number));
		System.out.print("\nProduct of cube of factors -> " + findProductOfCubesOfFactors(number));
		System.out.print("\nIs a perfect number ? " + IsPerfectNumber(number));
		System.out.print("\nIs an abundant number ? " + IsAbundantNumber(number));
		System.out.print("\nIs a deficient number ? " + IsDeficientNumber(number));
		System.out.print("\nIs a strong number ? " + IsStrongNumber(number));
		
		//closing scanner object
		scanner.close();
	}
}