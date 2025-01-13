import java.util.Scanner;
import java.lang.Math;

class QuadraticRoots{
	
	public static int findDelta(int a, int b, int c){
		return (int)(Math.pow(b, 2) - 4 * a * c);
	}
	
	public static double[] findRoots(int a, int b, int delta){
		
		if(delta > 0){
			double [] roots = new double[2];
			
			//Taking negative of b			b
			b *= -1;
			
			roots[0] = ((double)(b) + (Math.sqrt(delta)))/(double)(2)*(double)(a);
			roots[1] = ((double)(b) - (Math.sqrt(delta)))/(double)(2)*(double)(a);
			
			return roots;
		}
			return new double[0];
	}
	
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input of the number a, b and c
		System.out.print("Enter value of a : ");
		int a = scanner.nextInt();
		
		System.out.print("Enter value of b : ");
		int b = scanner.nextInt();
		
		System.out.print("Enter value of c : ");
		int c = scanner.nextInt();
		
		int delta = findDelta(a, b, c);
		
		//calculating roots and storing results
		double[] results = findRoots(a, b, delta);
		//Displaying results
		
		if(results.length == 0){
			System.out.print("No roots found");
		}
		else{
			System.out.print("Found roots below: ");
			for(int i = 0; i < results.length; i++){
				System.out.print("\nRoot " + (i+1) + " -> " + results[i]);
			}
		}

		//closing scanner object
		scanner.close();
	}
}