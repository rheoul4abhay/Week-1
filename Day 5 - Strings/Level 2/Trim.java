import java.util.Scanner;

class Trim{
	public static int[] trimSpaces(String string){
		int start = 0;
		int end = string.length()-1;
		
		while(start < string.length() && string.charAt(start) == ' '){
			start++;
		}
		
		while(end >= 0 && string.charAt(end) == ' '){
			end--;
		}
		
		if(start > end) return new int[]{-1,-1};
		
		return new int[]{start, end+1}; //including end index (exclusive)
	}
	
	public static String createSubstring(String string, int start, int end){
		String result = "";
		for(int i = start; i < end;i++){
			result += string.charAt(i);
		}
		return result;
	}
	
	public static boolean compareStrings(String string1, String string2){
		if(string1.length() != string2.length()) return false;
		
		for(int i = 0;i < string1.length();i++){
			if(string1.charAt(i) != string2.charAt(i)) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string with leading and trailing spaces : ");
		String text = scanner.nextLine();
		
		int[] indices = trimSpaces(text);
		int start = indices[0];
		int end = indices[1];
		String result1 = "";
		if(indices[0] != -1){
			result1 = createSubstring(text, start, end);
		}
		System.out.print("Trimmed String -> " + result1);
		String result2 = text.trim();
		
		//compare results
		boolean areEqual = compareStrings(result1, result2);
		System.out.println("\nBoth methods give same result ? " + areEqual);
		scanner.close();
	}
}