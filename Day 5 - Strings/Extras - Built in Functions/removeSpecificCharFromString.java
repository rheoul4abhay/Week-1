import java.util.*;

public class removeSpecificCharFromString {
	
    public static String remove(String s, char c) {
		String newStr = "";
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i) != c) newStr+=s.charAt(i);
		}
		return newStr;
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
        System.out.print("Enter string: ");
		str = sc.next();
		
		char c = ' ';
		
		System.out.print("Enter character you want to remove: ");
		c = sc.next().charAt(0);
		
		String removedStr = "";
		removedStr = remove(str, c);
		
		System.out.println("The new string after removal of "+c+" from "+str+" is "+removedStr);
    }
}