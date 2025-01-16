import java.util.Scanner;

class numberFormatException{
	
	public static void generateException(String input){
		int parsedInt = Integer.parseInt(input);
		System.out.print("Result : " + parsedInt);
	}	

	public static void handleException(String input){
		
		try{
			int parsedInt = Integer.parseInt(input);
			System.out.print("Result : " + parsedInt);
		}
		catch(NumberFormatException e){
			System.out.print("\nerr : " + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs 
		System.out.print("Enter String: ");
		String input = scanner.nextLine();
		
		try{
			generateException(input);
		}
		catch(Exception e){
			System.out.print("err : " + e);
		}
		handleException(input);
		//Closing scanner object
		scanner.close();
	}
}