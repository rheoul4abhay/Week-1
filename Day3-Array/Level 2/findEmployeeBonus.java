import java.util.Scanner;

public class findEmployeeBonus{
    public static void main(String[] args) {
        
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Years of service: ");
                double years = scanner.nextDouble();

                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter positive salary and non-negative years of service.");
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

		System.out.println("\nEmployee-wise details:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] + 
							   ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
		}
		System.out.println("\nSummary:");
		System.out.println("Total Bonus Payout: " + totalBonus);
		System.out.println("Total Old Salary: " + totalOldSalary);
		System.out.println("Total New Salary: " + totalNewSalary);
		scanner.close();
    }
}
