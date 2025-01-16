import java.util.Scanner;

class ConvertToLowercase{
	
	public static String toLowercase(String string){
		String result = "";
		for(int i = 0;i < string.length();i++){
			int ascii = string.charAt(i);
			if(ascii >= 65 && ascii <= 90){
				result += (char)((int)(ascii)+(int)(32));
			} else result += (char)(ascii);
		}
		return result;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs
		System.out.print("Enter string : ");
		String string = scanner.nextLine();
		
		//Calling appropriate methods 
		String result = toLowercase(string);
		
		//Displaying results
		System.out.print("Lowercase : " + result);
		
		//Closing scanner object
		scanner.close();
	}
}