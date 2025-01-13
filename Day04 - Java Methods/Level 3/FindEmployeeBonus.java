import java.util.*;

public class ZaraBonus {

    public static int[][] generateSalariesAndService() {
        Random rand = new Random();
        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = 1 + rand.nextInt(20);
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] newData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int yearsOfService = data[i][1];
            double bonus = 0;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;
            newData[i][0] = salary;
            newData[i][1] = newSalary;
            newData[i][2] = bonus;
        }
        return newData;
    }

    public static void calculateTotalsAndDisplay(double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee No | Old Salary | New Salary | Bonus");

        for (int i = 0; i < 10; i++) {
            totalOldSalary += newData[i][0];
            totalNewSalary += newData[i][1];
            totalBonus += newData[i][2];

            System.out.printf("%11d | %10.2f | %10.2f | %.2f%n", i + 1, newData[i][0], newData[i][1], newData[i][2]);
        }

        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f%n", totalBonus);
    }
}

public class FindEmployeeBonus {

    public static void main(String[] args) {
        int[][] employeeData = ZaraBonus.generateSalariesAndService();
        double[][] bonusData = ZaraBonus.calculateBonusAndNewSalary(employeeData);
        ZaraBonus.calculateTotalsAndDisplay(bonusData);
    }
}
