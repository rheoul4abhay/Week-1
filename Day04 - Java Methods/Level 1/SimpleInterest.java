import java.util.Scanner;

class SimpleInterest{
	
	public double simpleInterest(double principal, double rate, double time){
		return (principal*rate*time)/100;
	};
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter principal: ");
		double principal = scanner.nextDouble();
		
		System.out.print("Enter rate: ");
		double rate = scanner.nextDouble();
		
		System.out.print("Enter time: ");
		double time = scanner.nextDouble();
		
		//Creating new object of SimpleInterest Class
		SimpleInterest findSI = new SimpleInterest();
		
		//Calling out the simpleInterest method from findSI object
		double SI = findSI.simpleInterest(principal, rate, time);
		
		//Displaying Result
		System.out.print("The simple interest is " + SI + " for principal " + principal +
						", Rate of interest " + rate + " and Time " + time);
		
		//closing scanner object, at the end
		scanner.close();
	}
}