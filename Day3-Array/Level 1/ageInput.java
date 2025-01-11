import java.util.Scanner;

class ageInput{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = 10;

		int[] ages = new int[10];
		
		for(int i = 0;i < ages.length;i++){
			System.out.print("Enter the age of student " + (i+1) + " : ");
			ages[i] = scanner.nextInt();
		}
		
		System.out.println();
		for(int age : ages){
			if(age < 0){
				System.out.println("Invalid age : " + age + " as age cannot be negative. ");
			}
			else if(age >= 18){
				System.out.println("The student with the age " + age + " can vote.");
			}
			else{
				System.out.println("The student with the age " + age + " cannot vote.");
			}
		}
		scanner.close();
	}
}