import java.lang.Math;

class earthVolume{
	public static void main(String[] args){
		double radiusKilometers = 6378;
		double radiusMiles = radiusKilometers/1.6;

		double volumeKilometerCube = 4/3 * Math.PI * Math.pow(radiusKilometers, 3);
		double volumeMilesCube = 4/3 * Math.PI * Math.pow(radiusMiles, 3);

		System.out.println("The volume of earth in cubic kilometers is " + volumeKilometerCube + " and cubic miles is " + volumeMilesCube);
	}
}