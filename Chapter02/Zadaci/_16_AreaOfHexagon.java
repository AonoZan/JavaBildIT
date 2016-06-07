import java.util.Scanner;

public class _16_AreaOfHexagon {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter the side: ");

		// prikupi
		double side = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double area = ((3 * Math.pow(3.0, 1.0 / 2)) / 2) * Math.pow(side, 2);

		// serviraj rezultat
		System.out.printf("The area of the hexagon is %f", area);
		
//		dunno how Math.pow works... :I
//		2,598 * 30.250000
//		5,196 / 2 * 30.250000
//		3 * 1.732 / 2 * 30.250000
//		
//		for (double i = 1; i < 11; i++) {
//			System.out.println(Math.pow(3.0, 1/i) + "   " + i);
//			
//		}

	}

}
