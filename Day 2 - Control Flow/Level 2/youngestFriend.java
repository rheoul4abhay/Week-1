import java.util.Scanner;

class youngestFriend{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the age of Amar: ");
		int ageAmar = scanner.nextInt();
		System.out.print("Enter the height(cm) of Amar: ");
		double heightAmar = scanner.nextDouble();

		System.out.print("Enter the age of Akbar: ");
		int ageAkbar = scanner.nextInt();
		System.out.print("Enter the height(cm) of Akbar: ");
		double heightAkbar = scanner.nextDouble();

		System.out.print("Enter the age of Anthony: ");
		int ageAnthony = scanner.nextInt();
		System.out.print("Enter the height(cm) of Anthony: ");
		double heightAnthony = scanner.nextDouble();
		
		//To check who is the youngest
		if((ageAmar < ageAkbar) && (ageAmar < ageAnthony)){
				System.out.print("Amar is youngest. ");
		}
		else if((ageAkbar < ageAmar) && (ageAkbar < ageAnthony)){
				System.out.print("Akbar is youngest. ");
		}
		else if((ageAnthony < ageAkbar) && (ageAnthony < ageAmar)){
				System.out.print("Anthony is youngest. ");
		}
		else{
				System.out.print("No one is youngest");
		}
		
		//To check who is the tallest
		if((heightAmar > heightAkbar) && (heightAmar > heightAnthony)){
				System.out.print("Amar is tallest. ");
		}
		else if((heightAkbar > heightAnthony) && (heightAkbar > heightAmar)){
				System.out.print("Akbar is tallest. ");
		}
		else if((heightAnthony > heightAkbar) && (heightAnthony > heightAmar)){
				System.out.print("Anthony is tallest. ");
		}
		else{
				System.out.print("No one is tallest.");
		}
		scanner.close();
	}
}