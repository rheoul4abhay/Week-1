import java.util.Scanner;

class findBMI{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Height(in cm): ");
		double height = scanner.nextDouble();

		System.out.print("Enter Weight(in kg): ");		
		double weight = scanner.nextDouble();
		
		double heightMeter = height/100;
		double BMI = weight/(heightMeter*heightMeter);

		if(BMI <= 18.4){
			System.out.print("Underweight");
		}
		else if(BMI >= 18.5 && BMI <= 24.9){
			System.out.print("Normal");
		}
		else if(BMI >= 25.0 && BMI <= 39.9){
			System.out.print("Overweight");
		}
		else{
			System.out.print("Obese");
		}
		scanner.close();
	}
}