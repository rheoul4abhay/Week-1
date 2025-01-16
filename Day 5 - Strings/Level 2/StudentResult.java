import java.util.Scanner;

class StudentResult{
	
	public static int[][] generateRandomScores(int numberOfStudents){
		int[][] scores = new int[numberOfStudents][3];
		for(int i = 0;i < numberOfStudents;i++){
			scores[i][0] = (int)(Math.random() * 90 + 10);			
			scores[i][1] = (int)(Math.random() * 90 + 10);			
			scores[i][2] = (int)(Math.random() * 90 + 10);			
		}
		return scores;
	}
	
	public static double[][] calculateResult(int[][] scores){
		double[][] scorecard = new double[scores.length][3];
		
		for(int i = 0;i < scores.length;i++){
			double totalScore = scores[i][0] + scores[i][1] + scores[i][2];
			double average = Math.round((totalScore/3));
			double percentage = Math.round((totalScore/300)*100);
			scorecard[i][0] = totalScore;
			scorecard[i][1] = average;
			scorecard[i][2] = percentage;
		}
		return scorecard;
	}
	
	public static String[][] calculateGrades(double[][] results){
        String[][] grades = new String[results.length][1];
		
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
	}
	
	 public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
			System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |%n", 
							  "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Grade");
			System.out.println("---------------------------------------------------------------------------");

			for (int i = 0; i < scores.length; i++) {
				System.out.printf("| %-10d | %-10d | %-10d | %-10d | %-10.0f | %-10.2f | %-10s |%n",
								  (i + 1), scores[i][0], scores[i][1], scores[i][2],
								  results[i][0], results[i][1], grades[i][0]);
			}
			System.out.println("---------------------------------------------------------------------------");
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Take input
		System.out.print("Enter the number of students -> ");
		int numberOfStudents = scanner.nextInt();
		
		int[][] generatedScores = generateRandomScores(numberOfStudents);
		double[][] scorecard = calculateResult(generatedScores);
		String[][] grades = calculateGrades(scorecard);
		
		//display scorecard
		displayScorecard(generatedScores, scorecard, grades);
		scanner.close();
	}
}