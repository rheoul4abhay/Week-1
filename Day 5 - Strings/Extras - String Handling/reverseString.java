import java.util.*;

public class reverseString {
	
    public static String reverse(String s) {
		String output = "";
		for (int i=s.length()-1; i>=0; i--){
			output += s.charAt(i);
		}
		return output;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		System.out.print("Enter string: ");
		s = sc.next();
		
		String reverseString = reverse(s);
		System.out.print("The reverse output of "+s+" is "+reverseString);
		
		sc.close();
    }
}