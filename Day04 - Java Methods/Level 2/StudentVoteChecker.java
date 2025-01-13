import java.util.Scanner;

public class StudentVoteChecker{
	public boolean canStudentVote(int age){
		if(age <= 0){
			return false;
		}
		else if(age < 18){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Creating object of Student vote checker class
		StudentVoteChecker studentVoteChecker = new StudentVoteChecker();
		
		int numberOfStudents = 10;
		int[] ages = new int[numberOfStudents];
		
		//Taking user input
		System.out.print("Enter ages of the 10 students below\n");
		
		//Storing the ages of all the 10 students in array
		for(int i = 0;i < ages.length; i++){
			System.out.print("\nEnter age of student " + (i+1) + ": ");
			ages[i] = scanner.nextInt();
		}
		
		System.out.println();
		//Validating each age for voting criteria and displaying results
		for(int i = 0;i < ages.length; i++){
			boolean canVote = studentVoteChecker.canStudentVote(ages[i]);
			if(canVote) System.out.println("Student " + (i+1) + " can vote.");
			else System.out.println("Student " + (i+1) + " cannot vote.");
		}

		//closing scanner object
		scanner.close();
	}
}