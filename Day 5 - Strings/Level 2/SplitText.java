import java.util.Scanner;

class SplitText{
	
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
	public static String[] textToWords(String string){
		int stringLength = findLength(string);
		
		int wordCount = 1;
		int index = 0;
		for(int i = 0;i < stringLength; i++){
			if(string.charAt(i) == ' ') wordCount++;
		}
		
		String[] words = new String[wordCount];
		int wordIndex = 0;
		String word = "";
		for(int i = 0;i < stringLength;i++){
			char letter = string.charAt(i);
			if(letter == ' '){
				if(!word.isEmpty()){
					words[wordIndex++] = word;
					word = ""; //resetting word
				}
			}
			else{
				word += letter;
			}
		}
		
		if(!word.isEmpty()){
			words[wordIndex] = word;
		}
		
		return words;
	}
	
	public static boolean compare(String[] arr1, String[] arr2){
		if(arr1.length != arr2.length) return false;
		
		for(int i = 0;i < arr1.length;i++){
			if(!arr1[i].equals(arr2[i])) return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input 
		System.out.print("Enter a text : ");
		String text = scanner.nextLine();	
		
		String[] words = textToWords(text);
		
		System.out.print("Words in text : ");
		for(int i = 0;i < words.length;i++){
			System.out.print("\nWord " + (i+1) + " -> " + words[i]);
		}
		
		boolean areEqual = compare(words, text.split(" "));
		System.out.println("\nComparision results -> " + areEqual);
		//closing scanner object
		scanner.close();
	}
}
