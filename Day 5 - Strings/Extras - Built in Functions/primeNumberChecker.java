import java.util.*;

public class primeNumberChecker {
	
    public static String LongestWordInSentence(String s) {
		String[] words = s.split(" ");
		String longestWord = "";
		for (int i=0; i<words.length; i++){
			if (words[i].length() > longestWord.length()) longestWord = words[i];
		}
		return longestWord;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		System.out.print("Enter string: ");
		s = sc.nextLine();
		
		String longestWord = LongestWordInSentence(s);
		System.out.print("Longest word in \""+s+"\" is "+longestWord);
		
		sc.close();
    }
}