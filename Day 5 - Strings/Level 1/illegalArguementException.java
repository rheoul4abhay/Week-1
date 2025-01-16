import java.util.Scanner;

class illegalArguementException{
	
	public static void generateException(String string, int start, int end){
		System.out.print("Required Substring: " + string.substring(start, end));
	}
	
	public static void handleException(String string, int start, int end){
		try{
		System.out.print("Required Substring: " + string.substring(start, end));
		}
		catch(IllegalArgumentException e){
			System.out.print("\nError message : " + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs
		System.out.print("Enter a string : ");
		String string = scanner.nextLine();
		
		System.out.print("Start: ");
		int start = scanner.nextInt();
		
		System.out.print("End: ");
		int end = scanner.nextInt();
		
		//Calling appropriate methods 
		try{
			generateException(string, start, end);
		}
		catch(Exception e){
			System.out.print("Error generated : " + e + "\n");
		}
		handleException(string, start, end);
		//Closing scanner object
		scanner.close();
	}
}