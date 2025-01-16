import java.util.Scanner;

class VowelsConsonants2{
	
	public static String characterCheck(char letter){
		int ascii = letter;
		String[] cases = {"Vowel", "Consonant", "Not a letter"};

		if(ascii >= 65 && ascii <= 90){
			letter = (char)((int)(ascii) + (int)(32));
		}
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
			return cases[0];
		}
		else if((int)(letter) >= 97 && (int)(letter) <= 122){
			return cases[1];
		}
		
		return cases[2];
	}
	
	public static String[][] character2D(String string){
		String[][] results = new String[string.length()][2];
		
		for(int i = 0;i < string.length();i++){
			char letter = string.charAt(i);
			String type = characterCheck(letter);
			results[i][0] = String.valueOf(letter);
			results[i][1] = type;
		}
		return results;
	}
	
	public static void display2DArray(String[][] array) {
	System.out.println("+---------+---------------+");
	System.out.printf("| %-7s | %-13s |%n", "Character", "Type");
	System.out.println("+---------+---------------+");
	for (String[] row : array) {
		System.out.printf("| %-7s | %-13s |%n", row[0], row[1]);
	}
	System.out.println("+---------+---------------+");
}
	public static void main(String args[]){
		//Scanner object
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter text -> ");
		String text = scanner.nextLine();
		
		String charArray2D[][] = character2D(text);
		display2DArray(charArray2D);
		//closing scanner object
		scanner.close();
	}
}
