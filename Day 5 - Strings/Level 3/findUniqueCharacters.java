import java.util.Scanner;

class findUniqueCharacters{
	
	public static int stringLength(String string){
		int count = 0;
		try{
			while(true){
				char c = string.charAt(count);
				count++;
			}
		}
		catch(Exception e){
		}
		return count;
	}
	
	public static char[] uniqueCharacters(String string){
		int length = stringLength(string);
		char[] uniques = new char[length];
		
		int index = 0;
		for(int i = 0;i < length;i++){
			char letter = string.charAt(i);
			if(letter == ' ') continue;
			boolean isUnique = true;
			for(int j = 0;j < i;j++){
				if(string.charAt(i) == string.charAt(j)){
					isUnique = false;
					break;
				}
			}
			if(isUnique){
				uniques[index] = letter;
				index++;
			}
		}
		return uniques;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a text -> ");
		String text = scanner.nextLine();
		System.out.print("Unique characters in array -> ");
		char[] uniqueChar = uniqueCharacters(text);
		
		for(int i = 0;i < uniqueChar.length;i++){
			System.out.print("\n" + uniqueChar[i]);
		}
		scanner.close();
	}
}