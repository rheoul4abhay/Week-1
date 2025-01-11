import java.util.Scanner;

class springSeason{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter month: ");
		int month = scanner.nextInt();

		System.out.print("Enter day: ");
		int day = scanner.nextInt();
		
		if((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)){
			System.out.print("Its a Spring Season");
		}
		else{
			System.out.print("Not a Spring Season");
		}
		scanner.close();
	}
}