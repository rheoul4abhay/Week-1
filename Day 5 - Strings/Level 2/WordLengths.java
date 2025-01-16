import java.util.Scanner;

class WordLengths{
	
	//Recreating string.length() method below
	public static int findLength(String string){
		
		int counter = 0;
		try{
			while(true){
				char c = string.charAt(counter);
				counter++;
			}
		}
		catch(Exception e){
		}
		return counter;
	}
	
	//To split text into words 
	public static String[][] textToWords(String string){
		int stringLength = findLength(string);
		
		int wordCount = 1;
		int index = 0;
		for(int i = 0;i < stringLength; i++){
			if(string.charAt(i) == ' ') wordCount++;
		}
		
		String[][] words = new String[wordCount][2];
		int wordIndex = 0;
		String word = "";
		for(int i = 0;i < stringLength;i++){
			char letter = string.charAt(i);
			if(letter == ' '){
				if(!word.isEmpty()){
					int wordLength = findLength(word);
					words[wordIndex][0] = word;
					words[wordIndex][1] = Integer.toString(wordLength);
					word = ""; //resetting word
					wordIndex++;
				}
			}
			else{
				word += letter;
			}
		}
		
		if(!word.isEmpty()){
			int wordLength = findLength(word);
			words[wordIndex][0] = word;
			words[wordIndex][1] = Integer.toString(wordLength);
		}
		return words;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input 
		System.out.print("Enter a text : ");
		String text = scanner.nextLine();	
		
		String[][] words = textToWords(text);
		
		System.out.print("Words in text with their lengths: \n");
		for(int i = 0;i < words.length;i++){
			System.out.print(words[i][0] + " -> " + words[i][1]);
			System.out.println();
		}
		//closing scanner object
		scanner.close();
	}
}
