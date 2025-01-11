import java.util.Scanner;

class votingEligibility{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		
		System.out.print("The person's age is " + age);
		if(age >= 18){
			System.out.print(" and can vote.");
		}
		else{
			System.out.print(" and cannot vote.");
		}
		scanner.close();
	}
}