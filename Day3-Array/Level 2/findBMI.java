import java.util.Scanner;

public class findBMI{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of person: ");
		int numPerson = scanner.nextInt();
	
		double[] weight = new double[numPerson];
		double[] height = new double[numPerson];
		double[] BMI = new double[numPerson];
		String[] status = new String[numPerson];
		
		int bmiIndex = 0;
		int weightIndex = 0;
		int heightIndex = 0;
		int statusIndex = 0;
		
		for(int i = 0;i < numPerson;i++){
			System.out.println("Person " + (i+1));
			System.out.print("Height: ");
			double h = scanner.nextDouble();
			height[heightIndex++] = h;
			System.out.print("Weight: ");
			double w = scanner.nextDouble();
			weight[weightIndex++] = w;
			
			double heightMeter = h/100;
			double bmi = w/(double)(heightMeter*heightMeter);
			BMI[bmiIndex++] = bmi;
			
			//conditionals
			
			if(bmi <= 18.4){
				status[statusIndex++] = "Underweight";
			}
			else if(bmi >= 18.5 && bmi <= 24.9){
				status[statusIndex++] = "Normal";
			}	
			else if(bmi >= 25 && bmi <= 39.9){
				status[statusIndex++] = "Overweight";
			}
			else if(bmi >= 40) status[statusIndex++] = "Obese";
		}
		
		System.out.println("/nResults : ");
		for(int i = 0;i < numPerson;i++){
			System.out.println("\nPerson " + (i+1) + (" : "));
			System.out.print("Height : " + height[i]);
			System.out.print("\nWeight : " + weight[i]);
			System.out.print("\nBMI : " + BMI[i]);
			System.out.print("\nStatus : " + status[i]);
		}
		scanner.close();
    }
}
