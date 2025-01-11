import java.util.Scanner;

public class percentageGrade2{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		System.out.print("Number of students: ");
		int numStudents = scanner.nextInt();
		
		double[][] marks = new double[numStudents][3];
		double[] percentage = new double[numStudents];
		char[] grade = new char[numStudents];
		double[] marksTotal = new double[numStudents];
		
		String[] subjects = {"Physics", "Chemistry", "Maths"};
		
		for(int i = 0;i < numStudents;i++){
			System.out.println("Enter Student " + (i+1) + " marks: ");
			for(int j = 0;j < 3;j++){
				System.out.print("Marks in " + subjects[j] + " : ");
				marks[i][j] = scanner.nextDouble();
				if(marks[i][j] < 0){
					System.out.println("You must Enter positive values. \n");
					j--;
				}
			}
		}
		
		int percentageIndex = 0;
		int gradeIndex = 0;
		int marksIndex = 0;
		
		System.out.println("\nResults of students: ");
		for(int i = 0;i < marks.length;i++){
			double marksSum = 0;
			for(int j = 0;j < marks[0].length;j++){
				marksSum += marks[i][j];
			}
			marksTotal[marksIndex++] = marksSum;
			double percent = marksSum/300*100;
			percentage[percentageIndex++] = percent;
			if(percent >= 80){
				grade[gradeIndex++] = 'A';
			}
			else if(percent >= 70 && percent <= 79){
				grade[gradeIndex++] = 'B';
			}
			else if(percent >= 60 && percent <= 69){
				grade[gradeIndex++] = 'C';
			}
			else if(percent >= 50 && percent <= 59){
				grade[gradeIndex++] = 'D';
			}
			else if(percent >= 40 && percent <= 49){
				grade[gradeIndex++] = 'E';
			}
			else{
				grade[gradeIndex++] = 'R';
			}
		}
		 
		for(int i = 0;i < numStudents;i++){
			System.out.println("\nStudent " + (i+1) + " Results: ");
			System.out.print("Total Marks out of 300 : " + marksTotal[i] + ", ");
			System.out.print(" Percentage: " + percentage[i] + ", ");
			System.out.print(" Grade: " + grade[i] + ", ");
		}
		scanner.close();
    }
}
