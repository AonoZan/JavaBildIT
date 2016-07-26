import java.util.Scanner;

public class _02_GreatCircleDistance {

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
		double great_circle_distance = radius * Math.acos((Math.sin(pointOneLatitude) * Math.sin(pointTwoLatitude) +
				Math.cos(pointOneLatitude) * Math.cos(pointTwoLatitude) *
				Math.cos(pointOneLongitude - pointTwoLongitude)));
		
		unos.close();
		
		System.out.printf("\nThe distance between two points is %f km.", great_circle_distance);
	}

}
