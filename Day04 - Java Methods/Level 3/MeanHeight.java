import java.util.Scanner;

class MeanHeight{
	
	public static int[] generateRandomHeights(int size){
		
		int[] randomHeights = new int[size];
		for(int i = 0;i < size;i++){
			int randomHeight = (int)((Math.random()*100+150));
			System.out.print("\nRandom Height for player " + (i+1) + " : " +
							randomHeight + "cm");
			randomHeights[i] = randomHeight;
		}
		return randomHeights;
	}
	
	public static int sumOfHeights(int[] heights){
		
		int sum = 0;
		for(int i = 0;i < heights.length;i++){
			sum += heights[i];
		}
		return sum;
	}
	
	public static double meanHeight(int sumOfHeights, int numberOfPlayers){
		return sumOfHeights/numberOfPlayers;
	}
	
	public static int minimumHeight(int[] heights){
		int minHeight = heights[0];
		for(int height: heights){
			minHeight = Math.min(height, minHeight);
		}
		return minHeight;
	}
	
	public static int maximumHeight(int[] heights){
		int maxHeight = heights[0];
		for(int height: heights){
			maxHeight = Math.max(height, maxHeight);
		}
		return maxHeight;
	}
	
	public static void main(String[] args){
		//Creating scanner object from Scanner utility class
		Scanner scanner = new Scanner(System.in);
		
		int numberOfPlayers = 11;
		
		//Generating random numbers below
		System.out.print("Generated random heights below\n");
		int[] generatedHeights = generateRandomHeights(numberOfPlayers);
		
		//To get mean height
		int heightsSum = sumOfHeights(generatedHeights);
		double meanHeightOfPlayers = meanHeight(heightsSum, numberOfPlayers);
		
		//To get shortest and tallest person height
		int shortestHeight = minimumHeight(generatedHeights);
		int tallestHeight = maximumHeight(generatedHeights);
		
		System.out.println();
		//Displaying results
		System.out.print("\nMean Height Of Players : " + meanHeightOfPlayers);
		System.out.print("\nShortest Height : " + shortestHeight);
		System.out.print("\nTallest Height : " + tallestHeight);
		
		//closing scanner object
		scanner.close();
	}
}