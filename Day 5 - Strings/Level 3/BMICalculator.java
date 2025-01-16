import java.util.Scanner;

class BMICalculator{
	
	public static String[][] calculateBMI(double[][] heightWeight){
		int numberOfPerson = heightWeight.length;
		
		String[][] bmiStatus = new String[numberOfPerson][4];
		
		for(int i = 0;i < numberOfPerson;i++){
			double heightCM = heightWeight[i][0];
			double weight = heightWeight[i][1];
			double heightM = heightCM/100;
			double bmi = weight/(heightM * heightM);
			bmi = Math.round(bmi*100)/100; //rounding off upto 2 places of decimal
			
			String status = "";
			if(bmi < 18.5){
				status = "Underweight";
			} else if(bmi >= 18.5 && bmi <= 24.9){
				status = "Normal";
			} else if(bmi >= 25 && bmi <= 29.9){
				status = "Overweight";
			} else {
				status = "Obese";
			}
			
			bmiStatus[i][0] = String.valueOf(heightCM);
			bmiStatus[i][1] = String.valueOf(weight);
			bmiStatus[i][2] = String.valueOf(bmi);
			bmiStatus[i][3] = status;
		}
		return bmiStatus;
	}
	
	public static void displayTable(String[][] bmiResults){
		System.out.printf("| %-8s | %-7s | %-6s | %-12s | %n", "Height", "Weight", "BMI", "Status");
		System.out.println("---------------------------------------------");
		for(String[] row: bmiResults){
			System.out.printf("| %-8s | %-7s | %-6s | %-12s | %n", row[0], row[1], row[2],row[3]);
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numberOfPerson = 3;
		
		double[][] heightWeight = new double[numberOfPerson][2];
		for(int i = 0;i < numberOfPerson;i++){
			System.out.print("Enter height(cm) of person " + (i+1) + " -> ");
			heightWeight[i][0] = scanner.nextDouble();
			System.out.print("Enter weight(kg) of person " + (i+1) + " -> ");
			heightWeight[i][1] = scanner.nextDouble();
		}
		
		//calculate bmi and status
		String[][] bmiStatus = calculateBMI(heightWeight);
		System.out.print("\nTabulated results : \n");
		System.out.println();
		displayTable(bmiStatus);
		
		scanner.close();
	}
}