import java.util.Scanner;

class ConvertToUppercase{
	
	public static String toUppercase(String str){
		String result = "";
		for(int i = 0;i < str.length();i++){
			int ascii = str.charAt(i);
			if(ascii >= 97 && ascii <= 122) result += (char)((int) ascii - (int)(32));
			else result += (char)(ascii);
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
		String result = toUppercase(string);
		
		//Displaying results
		System.out.print("Uppercase : " + result);
		
		//Closing scanner object
		scanner.close();
	}
}