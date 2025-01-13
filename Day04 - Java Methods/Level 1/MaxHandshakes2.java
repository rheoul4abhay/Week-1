import java.util.Scanner;

class MaxHandshakes2{
	
	//Making this method as static so it could be accessed inside class(Testing)
	public static int maxHandshakes(int numberOfStudents){
		return (numberOfStudents*(numberOfStudents-1)/2);
	};
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter number of students: ");
		int numberOfStudents = scanner.nextInt();
		
		//Calling out the maxHandshakes method from the class name
		System.out.print("The maximum possible number of handshakes is " + 
						MaxHandshakes2.maxHandshakes(numberOfStudents));
		scanner.close();
	}
}