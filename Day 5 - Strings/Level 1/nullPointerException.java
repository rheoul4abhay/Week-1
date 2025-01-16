import java.util.Scanner;

class nullPointerException{
	
	public static void generateException(){
		String text = null;
		System.out.print("Length of string : " + text.length());
	}
	
	public static void handleException(){
		String text = null;
		try{
			System.out.print("Length of string "+ text.length());
		}
		catch(NullPointerException e){
			System.out.print("\nError message : " + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs 
		String text = null;
		
		//Calling appropriate methods 
		try{
			generateException();
		}
		catch(Exception e){
			System.out.print("Error generated : " + e + "\n");
		}
		handleException();
		//Closing scanner object
		scanner.close();
	}
}