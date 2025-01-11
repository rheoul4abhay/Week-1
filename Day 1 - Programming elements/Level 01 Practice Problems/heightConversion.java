import java.util.Scanner;

class heightConversion{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Height(cm) : ");
 		double heightCM = scanner.nextDouble();
			
		double heightInches = heightCM/2.54;
		
		double heightFoot = heightInches/12;

		System.out.println("Your Height in cm is " + heightCM + " while in feet is " + heightFoot + " and inches is " + heightInches);
		scanner.close();
	}
}