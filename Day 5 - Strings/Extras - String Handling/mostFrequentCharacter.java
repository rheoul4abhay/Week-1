import java.util.*;

public class mostFrequentCharacter {
	
    public static void getMostFrequentChar(String s) {
		HashMap<Character, Integer> charCnt = new HashMap<>();
		int maxFreq = 0;
		char mostFreqChar = ' ';
		for (int i=0; i<s.length(); i++){
			charCnt.put(s.charAt(i), charCnt.getOrDefault(s.charAt(i), 0)+1);
			if (charCnt.get(s.charAt(i)) > maxFreq){
				maxFreq = charCnt.get(s.charAt(i));
				mostFreqChar = s.charAt(i);
			}
		}
		System.out.println("The most frequent character in "+s+" is "+mostFreqChar+" with frequency of "+maxFreq);
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
        System.out.print("Enter string: ");
		str = sc.next();
		
		getMostFrequentChar(str);
		
    }
}