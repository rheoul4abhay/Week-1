import java.util.Scanner;
import java.lang.Math;

class AverageValue{
	
	public static int[] generate4DigitRandomArray(int size){
		//Generating five 4 digit values and storing them in an array
		int[] randomValues = new int[size];
		
		System.out.print("\nGenerated " + size + " random values below: \n");
		for(int i = 0;i < randomValues.length; i++){
			int randomValue = ((int)((Math.random()*9000)) + 1000);
			System.out.print("\nRandom number " + (i+1) + " : " + randomValue);
			randomValues[i] = randomValue;
		}
		return randomValues;
	}
	
	
	public static double[] findAverageMinMax(int[] numbers){
		
		double[] results = new double[3];
		int sum = 0;
		for(int number : numbers){
			sum += number;
		}
		//Find average of numbers
		double average = sum/numbers.length;
		
		//Find minimum between numbers
		int min = numbers[0];
		for(int number: numbers) {
			min = Math.min(number, min);
		}
		
		//Find maximum between numbers
		int max = numbers[0];
		for(int number: numbers) {
			max = Math.max(number, max);
		}
		
		results[0] = average;
		results[1] = min;
		results[2] = max;
		return results;
	}
	
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		int numbersCount = 5;
		
		//Generating the random 4 digits numbers and displaying their values
		int[] generatedArray = generate4DigitRandomArray(numbersCount);
		
		//Getting results array which contains average,min and max 
		double[] results = findAverageMinMax(generatedArray);
		
		//Displaying results
		System.out.println();
		System.out.print("\nAverage -> " + results[0]);
		System.out.print("\nMinimum value -> " + results[1]);
		System.out.print("\nMaximum value -> " + results[2]);

		//closing scanner object
		scanner.close();
	}
}