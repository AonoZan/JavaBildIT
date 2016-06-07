import java.util.Scanner;

public class _15_DistanceOfTwoPoints {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// prikupui tacku 1 (x1, y1)
		System.out.println("Enter x1 and y1: ");
		double x1 = unos.nextDouble();
		double y1 = unos.nextDouble();
		
		// prikupui tacku 2 (x2, y2)
		System.out.println("Enter x2 and y2: ");
		double x2 = unos.nextDouble();
		double y2 = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj razdaljinu izmedju tacke 1 i 2 76.810000
//		double distance = Math.pow(((x1 - y1) * (x1 - y1))
//				+ ((x2 - y2) * (x2 - y2)), 0.5);
		
		double distance = Math.pow((x2 - x1), 2) + Math.pow((double)(y2 - y1), 2);
		distance = Math.pow(distance, 0.5);
		
		// rezultat
		System.out
				.printf("The distance between the two points is %f", distance);
	}

}
