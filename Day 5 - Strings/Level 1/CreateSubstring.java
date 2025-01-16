import java.util.Scanner;

class CreateSubstring{
	
	public static String createSubstring(String s, int start, int end){
		String subString = "";
		String temp = s;
		for(int i = start;i <= end;i++){
			subString += s.charAt(i);
		}
		return subString;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs 
		System.out.print("Enter the string : ");
		String s = scanner.nextLine();
		
		System.out.print("Start Index : ");
		int start = scanner.nextInt();
		
		System.out.print("End Index : ");
		int end = scanner.nextInt();
		
		//Calling appropriate methods 
		String subStringS1 = createSubstring(s, start, end);
		String subStringS2 = s.substring(start, end+1);
		
		//Displaying results
		System.out.print("\nSubstring of string " + s + " is : "  + createSubstring(s, start, end));
		System.out.print("\nSubstring comparision result : " + subStringS1.equals(subStringS2));
		
		//Closing scanner object
		scanner.close();
	}
}