import java.util.Scanner;

class totalIncome{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Salary: ");
		double salary = scanner.nextDouble();

		System.out.print("Bonus: ");
		double bonus = scanner.nextDouble();

		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
				". Hence, total salary is INR " + (salary + bonus));
		scanner.close();
	}
}