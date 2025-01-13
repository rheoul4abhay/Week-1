import java.util.Scanner;

class FactorsOfNumber{
	
	public static int[] findFactors(int number){
		
		//count the number of factors of the number
		int count = 0;
		for(int i = 1;i < number;i++){
			if(number%i == 0) count++;
		}
		
		//to find the factors of the number and store them in the array we use another loop
		int[] factors = new int[count];
		int index = 0;
		
		for(int i = 1;i < number;i++){
			if(number%i == 0) factors[index++] = i;
		}
		return factors;
	}
	
	public static int sum(int[] arr){
		int sumOfFactors = 0;
		
		for(int factor: arr) sumOfFactors += factor;
		return sumOfFactors;
	}
	
	public static int sumOfSquares(int[] arr){
		int sumOfSquares = 0;
		
		for(int factor: arr) sumOfSquares += (int)(Math.pow(factor, 2));
		return sumOfSquares;
	}
	
	public static int product(int[] arr){
		int productOfFactors = 1;
		
		for(int factor: arr) productOfFactors *= factor;
		return productOfFactors;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		//calling findFactors method to find all the factors of number
		int[] factors = findFactors(number);
		
		System.out.print("\nFactors of " + number + " are: \n" );
		//To display factors
		for(int factor: factors) System.out.print(factor + " ");
		
		//To display results of operations on the factors of number
		System.out.print("\nSum of factors of " + number + "-> " + sum(factors));
		System.out.print("\nSum of squares of factors of " + number + "-> " + sumOfSquares(factors));
		System.out.print("\nProduct of factors of " + number + "-> " + product(factors));
		
		//closing scanner object
		scanner.close();
	}
}