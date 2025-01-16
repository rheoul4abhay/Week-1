import java.util.Scanner;

class LengthOfString{
	
	public static int findLength(String string){
		
		int counter = 0;
		try{	
			while(true){
				char temp = string.charAt(counter);
				counter++;
			}
		}
		catch(Exception e){
		}
		return counter;
	}
	
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a text: ");
		String text = scanner.next();
		
		int length = findLength(text);
		//Displaying result
		System.out.print("Length of string -> " + length);
		
		//Closing scanner
		scanner.close();
	}
}