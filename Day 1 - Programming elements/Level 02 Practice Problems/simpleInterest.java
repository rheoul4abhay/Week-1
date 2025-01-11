import java.util.Scanner;

class simpleInterest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Principal:");
		double principal = scanner.nextDouble();

		System.out.print("Rate:");
		double rate = scanner.nextDouble();

		System.out.print("Time:");
		double time = scanner.nextDouble();
		
		double simpleInterest = (principal * rate * time)/100;
		System.out.print("The simple interest is " + simpleInterest + " for principal " +
				principal + ", Rate of interest " + rate + " and Time " + time);
		scanner.close();
	}
}