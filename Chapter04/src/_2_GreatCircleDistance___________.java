import java.util.Scanner;

public class _2_GreatCircleDistance___________ {

	public static void main(String[] args) {
		// TODO 
		
		// create scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double pointOneLatitude = Math.toRadians(39.55);//unos.nextDouble();
		double pointOneLongitude = Math.toRadians(-116.25); //unos.nextDouble();
		
		System.out.print("\nEnter point 2 (latitude and longitude) in degrees: ");
		double pointTwoLatitude = Math.toRadians(41.5); //unos.nextDouble();
		double pointTwoLongitude = Math.toRadians(87.37); //unos.nextDouble();
		
		double radius = 6371.01; // earth's radius 10691.79813231593
		
		System.out.println();
		System.out.println(pointTwoLatitude);
		System.out.println(pointTwoLongitude);
		System.out.println(Math.cos( -1.5248941674674459 - 0.7243116395776468));
		// cloose scanner
		unos.close();
		
		// 10691.79813231593
		// 6371.01 * 1.6781951578032257
		// 6371.01 * Math.acos(-0.10719248458746422)
		// 6371.01 * Math.acos(0.636751347470152 * -0.8968727415326884 + 0.7710692066831263 * -0.44228869021900113 * 0.6962887112311471
		// -0.5710849266801887 + 0.4638924420927245
		// 0.7710692066831263 * -0.44228869021900113 * -1.3602480224507505
		// Math.cos(0.7243116395776468 - 1.5248941674674459)
		double distance = radius * Math.acos(
				  Math.sin(pointOneLatitude) * Math.sin(pointOneLongitude)
				+ Math.cos(pointOneLatitude) * Math.cos(pointOneLongitude)
				* Math.cos(pointTwoLatitude - pointTwoLongitude));

		System.out.printf("\nThe distance between two points is %f km.", distance);
	}

}
