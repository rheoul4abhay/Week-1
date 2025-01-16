import java.util.Scanner;

class VowelsConsonants1{
	
	public static void vowelsAndConsonants(String string){
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		System.out.println();
		for(int i = 0;i < string.length();i++){
			int ascii = string.charAt(i);
			char result = (char)(ascii);
			if(ascii >= 65 && ascii <= 90){
				result = (char)((int)(ascii) + (int)(32));
			}
			if(result == 'a' || result == 'e' || result == 'i' || result == 'o' || result == 'u'){
				vowelCount++;
				System.out.print("\n" + String.valueOf(result) + " is a vowel");
			}
			else if((int)(result) >= 97 && (int)(result) <= 122){
				consonantCount++;
				System.out.print("\n" + String.valueOf(result) + " is a consonant");
			}else{
				System.out.print("\n" + String.valueOf((char)(ascii)) + " is not a letter");
			}
		}
		System.out.println();
		System.out.print("\nVowel count -> " + vowelCount);
		System.out.print("\nConsonant count -> " + consonantCount);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a text -> ");
		String text = scanner.nextLine();
		
		vowelsAndConsonants(text);
		scanner.close();
	}
}