import java.util.Scanner;

class firstNonRepeatingCharacter{
	
	public static char nonRepeatingChar(String string){
		for(int i = 0; i < string.length()-1;i++){
			boolean repeated = false;
			for(int j = i+1;j < string.length();j++){
				if(string.charAt(i) == string.charAt(j)){
					repeated = true;
					break;
				}
			}
			if(!repeated) return string.charAt(i);
		}
		return '\0';
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a text -> ");
		String text = scanner.nextLine();
		
		char nonRepeating = nonRepeatingChar(text);
		System.out.print("First Non repeating character -> " + nonRepeating);
	}
}