import java.util.*;

public class palindrome {
	
    public static boolean check(String s) {
		int i=0, j=s.length()-1;
		while (i<j){
			if (s.charAt(i++) != s.charAt(j--)) return false;
		}
		return true;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		System.out.print("Enter string: ");
		s = sc.next();
		
		if (check(s)) System.out.print(s+" is a palindrome");
		else System.out.print(s+" is not a palindrome");
		
		sc.close();
    }
}