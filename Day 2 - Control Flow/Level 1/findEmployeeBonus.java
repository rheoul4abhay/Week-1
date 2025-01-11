import java.util.Scanner;

class findEmployeeBonus{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		double salary = scanner.nextDouble();

		System.out.print("Enter year of service: ");
		int yearOfService = scanner.nextInt();
		
		double bonusAmount = 0;	
		if(yearOfService > 5){
			bonusAmount = 0.05 * salary;
		}

		System.out.print("Bonus amount : " + bonusAmount);
		scanner.close();
	}
}