import java.util.*;

public class removeDuplicates {
	
    public static String remove(String s) {
		String newStr = "";
		HashSet<Character> set = new HashSet<>();
		for (int i=0; i<s.length(); i++){
			if (!set.contains(s.charAt(i))){
				set.add(s.charAt(i));
				newStr += s.charAt(i);
			}
		}
		return newStr;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		System.out.print("Enter string: ");
		s = sc.next();
		
		String newString = remove(s);
		System.out.print("After removing duplicates, "+s+" becomes "+newString);
		
		sc.close();
    }
}