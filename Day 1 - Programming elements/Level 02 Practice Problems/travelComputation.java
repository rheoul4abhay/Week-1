import java.util.Scanner;

class TravelComputation{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Name: ");
	String name = scanner.nextLine();

	System.out.print("fromCity: ");
	String fromCity = scanner.nextLine();

	System.out.print("viaCity: ");
	String viaCity = scanner.nextLine();
	
	System.out.print("toCity: ");
	String toCity = scanner.nextLine();
	
	System.out.print("Distance fromToVia: ");
	double distanceFromToVia = scanner.nextDouble();
	
	System.out.print("Distance viaToFinal: ");
	double distanceViaToFinal = scanner.nextDouble();

	System.out.print("Time taken for travel fromToVia in minutes : ");
	int timeFromToVia = scanner.nextInt();

	System.out.print("Time taken for travel viaToFinal in minutes : ");
	int timeViaToFinal = scanner.nextInt();
	
	double totalDistance = distanceFromToVia + distanceViaToFinal;
	int totalTime = timeFromToVia + timeViaToFinal;

	System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
	scanner.close();
	}
}