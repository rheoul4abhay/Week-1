import java.util.Scanner;

public class FindBMI2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1));

            double height;
            do {
                System.out.print("Enter height (in cm): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please try again.");
                }
            } while (height <= 0);
            personData[i][0] = height;

            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please try again.");
                }
            } while (weight <= 0);
            personData[i][1] = weight;

            double heightInMeters = height / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
               
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
