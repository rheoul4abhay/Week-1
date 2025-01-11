import java.util.Scanner;

class pecentageAndGrade{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter marks in Physics:");
		double marksPhysics = scanner.nextDouble();

		System.out.print("Enter marks in Maths: ");
		double marksMaths = scanner.nextDouble();
		
		System.out.print("Enter marks in Chemistry: ");
		double marksChemistry = scanner.nextDouble();

		double percentage = (marksPhysics + marksChemistry + marksMaths)/300*100;
		
		char grade = ' ';
		String remarks = " ";
		if(percentage >= 80){
			grade = 'A';
			remarks = "(Level 4, above agency-normalized standards)";
		}
		else if(percentage >= 70 && percentage <= 80){
			grade = 'B';
			remarks = "(Level 3, at agency-normalized standards)";
		}	
		else if(percentage >= 60 && percentage <= 69){
			grade = 'C';
			remarks = "(Level 2, below, but approaching agency-normalized standards)";
		}
		else if(percentage >= 50 && percentage <= 59){
			grade = 'D';
			remarks = "(Level 1, well below agency-normalized standards)";
		}
		else if(percentage >= 40 && percentage <= 49){
			grade = 'E';
			remarks = "(Level 1-, too below agency-normalized standards)";
		}
		else{
			grade = 'R';
			remarks = "(Remedial standards)";
		}

		System.out.print("Percentage of marks is " + percentage + " % and grade is : " + grade);
		System.out.println("\nRemarks : " + remarks);
		scanner.close();
	}
}