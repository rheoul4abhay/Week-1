import java.util.Scanner;

class VotingEligibility{
	
	public static int[] generateRandomAge(int numberOfStudents){
		int[] ages = new int[numberOfStudents];
		for(int i = 0;i < numberOfStudents;i++){
			ages[i] = (int)(Math.random() * 90 + 10);
		}
		return ages;
	}
	
	public static String[][] studentVotingStatusArray(int[] ages){
		int numberOfStudents = ages.length;
		String[][] votingStatus = new String[numberOfStudents][2];
		
		for(int i = 0;i < ages.length;i++){
			String age = String.valueOf(ages[i]);
			votingStatus[i][0] = age;
			if(ages[i] >= 18){
				votingStatus[i][1] = String.valueOf(true);
			}
			else if(ages[i] < 18){
				votingStatus[i][1] = String.valueOf(false);
			}
			else votingStatus[i][1] = "cannot vote";
		}
		return votingStatus;
	}
	
	public static void display2DArray(String[][] string, String col1, String col2){

		// Print table header
		System.out.printf("\n| %-10s | %-15s |%n", col1, col2);
		System.out.println("-------------------------------");

		// Print table rows
		for (int i = 0; i < string.length; i++) {
			System.out.printf("| %-10s | %-15s |%n", string[i][0], string[i][1]);
		}
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of student : ");
		int numberOfStudents = scanner.nextInt();
		
		int[] generatedAges = generateRandomAge(numberOfStudents);
		String[][] votingResults = studentVotingStatusArray(generatedAges);

		display2DArray(votingResults, "Age", "Can Vote?");
		scanner.close();
	}
}