import java.util.*;

public class StudentScores {

    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + rand.nextInt(50);
            scores[i][1] = 50 + rand.nextInt(50);
            scores[i][2] = 50 + rand.nextInt(50);
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] result = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
            result[i][3] = Math.round(average * 100.0) / 100.0;  // rounding average to 2 decimal places
        }
        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("Student No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");

        for (int i = 0; i < scores.length; i++) {
            char grade;
            String remarks;
            double averageMarks = result[i][3];

            if (averageMarks >= 80) {
                grade = 'A';
                remarks = "Level 4, above agency-normalized standards";
            } else if (averageMarks >= 70 && averageMarks < 79) {
                grade = 'B';
                remarks = "Level 3, at agency-normalized standards";
            } else if (averageMarks >= 60 && averageMarks < 69) {
                grade = 'C';
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (averageMarks >= 50 && averageMarks < 59) {
                grade = 'D';
                remarks = "Level 1, well below agency-normalized standards";
            } else if (averageMarks >= 40 && averageMarks < 49) {
                grade = 'E';
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = 'R';
                remarks = "Remedial standards";
            }

            System.out.printf("%10d\t%d\t%d\t%d\t%d\t%.2f\t%.2f\t%c\t%s\n",
                i + 1,
                scores[i][0],
				scores[i][1],
				scores[i][2],
                result[i][0],
                result[i][1],
                result[i][2],
                grade,
                remarks);
        }
    }
}

public class StudentsResults{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = StudentScores.generateScores(numStudents);
        double[][] result = StudentScores.calculateTotalAveragePercentage(scores);
        StudentScores.displayScorecard(scores, result);

        sc.close();
    }
}
