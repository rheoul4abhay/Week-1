import java.util.Scanner;

class findBMI{
	
	public static double calculateBMI(double height, double weight){
		return weight/(height*height);
	}
	
	public static String getStatus(double bmi){
		if(bmi <= 18.4) return "Underweight";
		else if(bmi >= 18.5 && bmi <= 24.9) return "Normal";
		else if(bmi >= 25 && bmi <= 39.9) return "Overweight";
		else if(bmi >= 40) return "Obese";
		else return "Cannot Determine";
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		int personCount = 10;
		//Creating suitable arrays
		double[] heights = new double[personCount];
		double[] weights = new double[personCount];
		double[] bmiResults = new double[personCount];
		
		//Taking user input of the numbers
		System.out.print("Enter the heights(meters) and weights(kg) below: \n");
		
		//Storing each number in the respective arrays
		for(int i = 0;i < personCount; i++){
			System.out.print("\nHeight of person " + (i+1) + ": ");
			heights[i] = scanner.nextDouble();
			System.out.print("Weight of person " + (i+1) + ": ");
			weights[i] = scanner.nextDouble();
			
			//Calculating BMI of each individual and storing results in bmi array
			bmiResults[i] = calculateBMI(heights[i], weights[i]);
		}
		
		//Displaying results
		for(int i = 0;i < heights.length;i++){
			System.out.print("\nPerson " + (i+1) + " results: \n");
			System.out.print("\nHeight(m): " + heights[i]);
			System.out.print("\nWeight(kg): " + weights[i]);
			System.out.print("\nBMI : " + bmiResults[i]);
			System.out.print("\nStatus: " + getStatus(bmiResults[i]));
			System.out.println();
		}

		//closing scanner object
		scanner.close();
	}
}