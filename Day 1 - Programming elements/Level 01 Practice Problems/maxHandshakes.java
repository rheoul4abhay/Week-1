import java.util.Scanner;

class maxHandshakes{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = scanner.nextInt();
		
		System.out.println("Number of possible handshakes: " + (numberOfStudents*(numberOfStudents-1))/2);
		scanner.close();
	}
}