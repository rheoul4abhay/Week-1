import java.util.Scanner;

class CharactersOfString{
	
	public static char[] createCharacterArray(String string){
		char[] charArray = new char[string.length()];
		
		for(int i = 0;i  < string.length();i++){
			charArray[i] = string.charAt(i);
		}
		return charArray;
	}
	
	public static boolean compareArrays(char[] c1, char[] c2){
		
		if(c1.length != c2.length) return false;
		for(int i = 0;i < c1.length;i++){
			if(c1[i] != c2[i])	return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user inputs 
		System.out.print("Enter a string : ");
		String string = scanner.nextLine();
		
		//Calling appropriate methods
		char[] charArray1 = createCharacterArray(string);
		char[] charArray2 = string.toCharArray();

		boolean areEqualArrays = compareArrays(charArray1, charArray2);
		
		//Displaying results
		System.out.print("Comparision : " + areEqualArrays);
		
		//Closing scanner object
		scanner.close();
	}
}