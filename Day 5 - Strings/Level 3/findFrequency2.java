import java.util.Scanner;

class findFrequency2{

	public static char[] uniqueCharacters(String string){
		boolean[] visited = new boolean[256];
		
		int uniqueCount = 0;
		
		for(int i = 0;i < string.length();i++){
			char ch = string.charAt(i);
			if(!visited[ch]){
				visited[ch] = true;
				uniqueCount++;
			}
		}
		
		char[] uniqueChar = new char[uniqueCount];
		int index = 0;
		
		for(int i = 0;i < string.length();i++){
			char ch = string.charAt(i);
			if(visited[ch]){
				uniqueChar[index++] = ch;
				visited[ch] = false;
			}
		}
		
		return uniqueChar;
	}
	
	public static String[][] findCharacterFrequency(String text, char[] uniqueChar){
		int[] frequency = new int[256];
		
		for(int i = 0;i < text.length();i++){
			char ch = text.charAt(i);
			frequency[ch]++;
		}
		
		String[][] result = new String[uniqueChar.length][2];
		
		for(int i = 0;i < uniqueChar.length;i++){
			result[i][0] = String.valueOf(uniqueChar[i]);
			result[i][1] = String.valueOf(frequency[uniqueChar[i]]);
		}
		
		return result;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a text -> ");
		String text = scanner.nextLine();
		
		char[] uniqueChar = uniqueCharacters(text);
		String[][] result = findCharacterFrequency(text, uniqueChar);
		
		//Displaying results
		System.out.print("Below are unique characters with their frequency: ");
		for(int i = 0;i < result.length;i++){
			System.out.print("\n" + result[i][0] + " -> " + result[i][1]);
		}
		scanner.close();
	}
}