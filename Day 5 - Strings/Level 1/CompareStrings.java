import java.util.Scanner;

class CompareStrings{
	
	public static boolean compare(String s1, String s2){
		
		if(s1.length() != s2.length()) return false;
		for(int i = 0;i < s1.length();i++){
			if(s1.charAt(i) != s2.charAt(i)) return false;
		}
		return true;
		
		//Alternate method 
		
		// int pointer = 0;
		
		// char[] ch1 = s1.toCharArray();
		// char[] ch2 = s2.toCharArray();
		
		// if(ch1.length != ch2.length) return false;
		// while(pointer != ch1.length){
			// if(ch1[pointer] != ch2[pointer]){
				// return false;
			// }
			// pointer++;
		// }
		// return true;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs 
		System.out.print("Enter 1st string : ");
		String s1 = scanner.nextLine();
		
		System.out.print("Enter 2nd string : ");
		String s2 = scanner.nextLine();
		
		//Calling method
		boolean result1 = compare(s1, s2);
		boolean result2 = s1.equals(s2);
		
		//Displaying results
		System.out.print("\nMethod result: " + result1);
		System.out.print("\nEqual method result : " + result2);
		
		//Closing scanner object 
		scanner.close();
	}
}