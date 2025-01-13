import java.util.Scanner;
import java.lang.Math;

class TrigonometricFunctions{
	
	public static double convertDegreeToRadians(double degree){
		return degree * Math.PI/180;
	}
	
	public static double[] calculateTrigonometricFunctions(double angle){
	    //Storing sine, cosine and tangent in order in calculatedResults array
		double[] calculatedResults = new double[3];
		
		calculatedResults[0] = Math.sin(angle);
		calculatedResults[1] = Math.cos(angle);
		calculatedResults[2] = Math.tan(angle);
		
		return calculatedResults;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter the angle in degree : ");
		double angleDegree = scanner.nextDouble();
		
		//converting degree into radians
		double angleRadians = convertDegreeToRadians(angleDegree);
		
		//Using calculateTrigonometricFunctions method to calculate sine, cosine and tangent
		double[] results = calculateTrigonometricFunctions(angleRadians);
		
		//Displaying results 
		System.out.print("\nSine of " + angleDegree + "-> " + results[0]);
		System.out.print("\nCosine of " + angleDegree + "-> " + results[1]);
		System.out.print("\nTangent of " + angleDegree + "-> " + results[2]);
		
		//closing scanner object
		scanner.close();
	}
}