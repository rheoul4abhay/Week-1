import java.util.Scanner;

class percentageGrade{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of student: ");
		int numStudents = scanner.nextInt();
		
		double[] marks = new double[numStudents];
		double[] percentages = new double[numStudents];
		char[] grades = new char[numStudents];
		String[] subjects = {"Physics", "Chemistry", "Maths"};
		
		for(int i = 0;i < numStudents;i++){
			System.out.println("\nEnter marks of student " + (i+1) + ": ");
			double totalMarks = 0;
			
			for(int j = 0;j < 3;j++){
				System.out.print("Enter marks in " + subjects[j] + " : ");
				double mark = scanner.nextDouble();
				
				if(mark < 0){
					System.out.print("Enter postive marks.\n");
					j--;
				}
				totalMarks += mark;
			}
			marks[i] = totalMarks;
			
			double percentage = totalMarks/300*100;
			percentages[i] = percentage;
			
			if(percentage >= 80){
				grades[i] = 'A';
			}
			else if(percentage >= 70 && percentage <= 79){
				grades[i] = 'B';
			}
			else if(percentage >= 60 && percentage <= 69){
				grades[i] = 'C';
			}
			else if(percentage >= 50 && percentage <= 59){
				grades[i] = 'D';
			}
			else if(percentage >= 40 && percentage <= 49){
				grades[i] = 'E';
			}
			else{
				grades[i] = 'R';
			}
		}
		
		for(int i = 0;i < numStudents;i++){
			System.out.println("\nStudent " + (i+1) + " Results: ");
			System.out.print("Total Marks out of 300 : " + marks[i] + ", ");
			System.out.print(" Percentage: " + percentages[i] + ", ");
			System.out.print(" Grade: " + grades[i] + ", ");
		}
		scanner.close();
	}
}