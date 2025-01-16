import java.util.Scanner;

class checkPalindrome{
	public static boolean checkForPalindrome(String string){
		int i = 0;
		int j = string.length()-1;
		
		while(i < j){
			if(string.charAt(i) != string.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text -> ");
		String text1 = scanner.nextLine();
		
		boolean result = checkForPalindrome(text1);
		System.out.print("Is a palindrome ? " + result);
		scanner.close();
	}
}