import java.util.Scanner;

class YoungestFriend{
	
	public static int findYoungest(int[] ages){
		int youngestAge = ages[0];
		int youngestAgeIndex = 0;
		
		for(int i = 0;i < ages.length;i++){
			if(ages[i] < youngestAge){
				youngestAge = ages[i];
				youngestAgeIndex = i;
			}
		}
		return youngestAgeIndex;
	}
	
	public static int findTallest(double[] heights){
		double tallestHeight = heights[0];
		int tallestHeightIndex = 0;
		
		for(int i = 0;i < heights.length;i++){
			if(heights[i] > tallestHeight){
				tallestHeight = heights[i];
				tallestHeightIndex = i;
			}
		}
		return tallestHeightIndex;
	}
	
	public static void main(String[] args){
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		int numberOfFriends = 3;
		
		//Creating suitable arrays
		int[] ages = new int[numberOfFriends];
		double[] heights = new double[numberOfFriends];
		String[] names = {"Amar", "Akbar", "Anthony"};
		
		//Taking user input for all three friends
		System.out.print("Enter ages of the " + numberOfFriends + " friends below\n");
		
		//Storing the details of each friend in respective arrays
		for(int i = 0;i < numberOfFriends; i++){
			System.out.print("\nEnter the age of " + names[i] + " : ");
			ages[i] = scanner.nextInt();
			
			System.out.print("Enter the height of " + names[i] + " : ");
			heights[i] = scanner.nextDouble();
		}
		
		System.out.println();
		//Using method call we find youngest and tallest, and display the results
		String youngestFriend = names[findYoungest(ages)];
		String tallestFriend = names[findTallest(heights)];
		
		System.out.print("Youngest Friend: " + youngestFriend);
		System.out.print("\nTallest Friend: " + tallestFriend);
		//closing scanner object
		scanner.close();
	}
}