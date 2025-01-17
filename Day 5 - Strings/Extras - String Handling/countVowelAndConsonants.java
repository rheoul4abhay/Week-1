import java.util.*;

public class countVowelAndConsonants {
	
	public static void solve(String a){
		int vowel = 0, consonant = 0;
		for (int i=0; i<a.length(); i++){
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') vowel++;
			else consonant++;
		}
		System.out.println("The count of vowel in "+a+(vowel>1 ? " are " : " is ")+vowel);
		System.out.println("The count of consonant in "+a+(consonant>1 ? " are " : " is ")+consonant);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		System.out.print("Enter string: ");
		s = sc.next();
		
		solve(s);
		
		sc.close();
	}
	
}


