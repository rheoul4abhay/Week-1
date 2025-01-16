import java.util.Scanner;

class findFrequency{
	
	public static String[][] frequencyCounter(String string){
	
		int[] frequency = new int[256];
		
		for(int i = 0;i < string.length();i++){
			char ch = string.charAt(i);
			frequency[ch]++;
		}
		
		//calculating unique characters count
		int uniqueCount = 0;
		for(int i = 0;i < 256;i++){
			if(frequency[i] > 0){
				uniqueCount++;
			}
		}
		String[][] result = new String[uniqueCount][2];
		
		int index = 0;
		for(int i = 0;i < 256;i++){
			if(frequency[i] > 0){
				result[index][0] = String.valueOf((char)(i));
				result[index][1] = String.valueOf(frequency[i]);
				index++;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a text -> ");
		String input = scanner.nextLine();
		
		String[][] uniques = frequencyCounter(input);
		System.out.print("Displaying uniques are their counts : \n");
		for(int i = 0;i < uniques.length;i++){
			System.out.print("\n"+uniques[i][0] + " -> " + uniques[i][1]);
		}
		scanner.close();
	}
}