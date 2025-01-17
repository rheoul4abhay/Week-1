import java.util.*;

public class replaceWordInSentence {
	
    public static String replace(String sentence, String existingWord, String newWord) {
		
		String[] words = sentence.split(" ");
		for (int i=0; i<words.length; i++){
			if (words[i].equals(existingWord)) words[i] = newWord;
		}
		String newSentence = "";
		for (int i=0; i<words.length; i++){
			newSentence += (words[i]+" ");
		}
		return newSentence;
		
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = "", existingWord = "", newWord = "";
		
        System.out.print("Enter sentence: ");
		sentence = sc.nextLine().trim();
		System.out.print("Enter word that has to be replaced: ");
		existingWord = sc.next();
		System.out.print("Enter word that will be replaced in place of \""+existingWord+"\": ");
		newWord = sc.next();
		
		String newSentence = replace(sentence, existingWord, newWord);
		
		System.out.println("Old Sentence: "+sentence);
		System.out.println("New Sentence: "+newSentence);
		
    }
}