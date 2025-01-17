import java.util.*;

public class checkAnagram {
	
    public static boolean check(String s1, String s2) {
		Map<Character, Integer> charMap1 = new HashMap<>();
		Map<Character, Integer> charMap2 = new HashMap<>();
		for (int i=0; i<s1.length(); i++){
			char c = s1.charAt(i);
			charMap1.put(c, charMap1.getOrDefault(c, 0)+1);
		}
		for (int i=0; i<s2.length(); i++){
			char c = s2.charAt(i);
			charMap2.put(c, charMap2.getOrDefault(c, 0)+1);
		}
		
		for (Map.Entry<Character, Integer> m : charMap1.entrySet()){
			if (charMap2.get(m.getKey()) != m.getValue()) return false;
		}
		return true;
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "", str2 = "";
		
        System.out.print("Enter first string: ");
		str1 = sc.next();
		
		System.out.print("Enter second string: ");
		str2 = sc.next();
		
		if (str1.length() != str2.length()) System.out.println("No, "+str1+" and "+str2+" are not anagram");
		else if (check(str1, str2)) System.out.println("Yes, "+str1+" and "+str2+" are anagram");
		else System.out.println("No, "+str1+" and "+str2+" are not anagram");
		
    }
}