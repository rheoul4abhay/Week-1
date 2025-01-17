import java.util.*;

public class substringOccurences {
	
    public static int getOccurences(String str, String subStr) {
		
		int initialIndex = 0, occurences = 0;
		while ((initialIndex = str.indexOf(subStr, initialIndex)) != -1){
			occurences++;
			initialIndex++;
		}
		return occurences;
		
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "", subStr = "";
		
		System.out.print("Enter string: ");
		str = sc.nextLine();
		
		System.out.print("Enter sub-string: ");
		subStr = sc.nextLine();
		
		int subStringOccurences = getOccurences(str, subStr);
		System.out.print("The occurences of "+subStr+" in "+str+" is "+subStringOccurences);
		
		sc.close();
    }
}