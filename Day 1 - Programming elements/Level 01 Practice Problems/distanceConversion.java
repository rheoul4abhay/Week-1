class distanceConversion{
	public static void main(String[] args){

		//taking distance as double
		double distanceKilometer = 1;
		
		//converting distance into miles by multiplying it by 1.6
		double distanceMiles = distanceKilometer * 1.6;
		
		//Displaying the result
		System.out.println("The distance " + distanceKilometer
				    + " km in miles is " + distanceMiles);
	}
}

