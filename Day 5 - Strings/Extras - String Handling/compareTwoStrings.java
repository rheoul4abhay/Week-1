import java.util.*;

public class compareTwoStrings {
	
    public static void compare(String s1, String s2) {
		for (int i=0; i<s1.length(); i++){
			if (i>=s2.length()){
				System.out.print("\""+s2+"\" comes before \""+s1+"\" in lexicographical order");
				return;
			} else if (s1.charAt(i) < s2.charAt(i)){
				System.out.print("\""+s1+"\" comes before \""+s2+"\" in lexicographical order");
				return;
			} else if (s2.charAt(i) < s1.charAt(i)){
				System.out.print("\""+s2+"\" comes before \""+s1+"\" in lexicographical order");
				return;
			}
		}
		System.out.print("\""+s1+"\" comes before \""+s2+"\" in lexicographical order");
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "", str2 = "";
		
        System.out.print("Enter first string: ");
		str1 = sc.next();
		
		System.out.print("Enter second string: ");
		str2 = sc.next();
		
		compare(str1, str2);
		
    }
}