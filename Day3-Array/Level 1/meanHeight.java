import java.util.Scanner;

class meanHeight{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		double[] heights = new double[11];
		for(int i = 0;i < heights.length;i++){
			System.out.print("Enter height of player " + (i+1) + " : ");
			heights[i] = scanner.nextDouble();
		}
		
		double sumHeights = 0;
		for(double height: heights){
			sumHeights += height;
		}
		double meanHeight = sumHeights/11;
		System.out.println("Mean height of the football team is : " + meanHeight);
		scanner.close();
	}
}