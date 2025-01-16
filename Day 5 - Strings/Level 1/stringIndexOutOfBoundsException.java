import java.util.Scanner;

class stringOutOfBoundsException{
	
	public static void generateException(String string){
		System.out.print("Character in string -> " + string.charAt(string.length()));
	}
	
	public static void handleException(String string){
		try{
			System.out.print("Character in string -> " + string.charAt(string.length()));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.print("\nError message : " + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs
		System.out.print("Enter a string : ");
		String string = scanner.nextLine();
		
		//Calling appropriate methods 
		try{
			generateException(string);
		}
		catch(Exception e){
			System.out.print("Error generated : " + e + "\n");
		}
		handleException(string);
		//Closing scanner object
		scanner.close();
	}
}