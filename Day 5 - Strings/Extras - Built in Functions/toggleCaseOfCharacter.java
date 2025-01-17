import java.util.*;

public class toggleCaseOfCharacter {
	
    public static String toggle(String str) {
		
		String newStr = "";
		for (int i=0; i<str.length(); i++){
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				newStr += (char)(str.charAt(i)-32);
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				newStr += (char)(str.charAt(i)+32);
			} else newStr += str.charAt(i);
		}
		return newStr;
		
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "", newStr = "";
		
		System.out.print("Enter string: ");
		str = sc.nextLine();
		
		newStr = toggle(str);
		
		System.out.print("The toggled version of "+str+" is "+newStr);
		
		sc.close();
    }
}