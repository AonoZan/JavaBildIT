import java.util.Scanner;

public class _12_FindingRunwayLength {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter speed and acceleration: ");

		// prikupi
		double speed = unos.nextDouble();
		double acceleration = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double minimumRunwayLength = (speed * speed) / (acceleration * 2);

		// serviraj rezultat
		System.out.printf("The minimum runway length for this airplane is %.f", minimumRunwayLength);

	}

}
