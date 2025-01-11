import java.util.Scanner;

class distanceYards{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Distance in feets: ");
		double feets = scanner.nextDouble();
		
		System.out.print("Distance in feets is " + feets + " while in yards is " + feets/3 + " and miles is " + (feets/3)/1760);
		scanner.close();
	}
}