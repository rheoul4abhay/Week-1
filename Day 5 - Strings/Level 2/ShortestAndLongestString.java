import java.util.Scanner;

class ShortestAndLongestString{
	
	public static int findLength(String string){
		
		int counter = 0;
		try{	
			while(true){
				char temp = string.charAt(counter);
				counter++;
			}
		}
		catch(Exception e){
		}
		return counter;
	}
	
	public static String[][] textToWords(String string){
		int stringLength = findLength(string);
		
		int wordCount = 1;
		for(int i = 0;i < stringLength;i++){
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
					wordIndex++;
					word = "";
				}
			}
			else{
				word += letter;
			}
		}
		
		//Adding the last word in the array
		if(!word.isEmpty()){					
			int wordLength = findLength(word);
			words[wordIndex][0] = word;
			words[wordIndex][1] = Integer.toString(wordLength);
		}
		return words;
	}
	
	public static int[] shortestAndLongestStringIndex(String[][] words2D){
		
		//maximum
		int[] minimumMaximum = new int[2];
		
		int maxi = Integer.MIN_VALUE;
		int maxIndex = -1;
		int mini = Integer.MAX_VALUE;
		int minIndex = -1;
		
		for(int i = 0;i < words2D.length;i++){
			int wordLength = Integer.valueOf(words2D[i][1]);
			if(wordLength > maxi){
				maxi = wordLength;
				maxIndex = i;
			}
			
			if(wordLength < mini){
				mini = wordLength;
				minIndex = i;
			}
		}
		
		minimumMaximum[0] = minIndex;
		minimumMaximum[1] = maxIndex;
		
		return minimumMaximum;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a text: ");
		String text = scanner.nextLine();
		
		int length = findLength(text);
		//Displaying result
		
		
		String[][] words = textToWords(text);
		int[] minMaxIndexes = shortestAndLongestStringIndex(words);
		
		System.out.print("\nShortest string -> " + words[minMaxIndexes[0]][0] + 
		" " + " Length -> " + words[minMaxIndexes[0]][1]);
		
		System.out.print("\nLongest string -> " + words[minMaxIndexes[1]][0] + 
		" " + " Length -> " + words[minMaxIndexes[1]][1]);
		
		//Closing scanner
		scanner.close();
	}
}