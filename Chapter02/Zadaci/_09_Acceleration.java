import java.util.Scanner;

public class _09_Acceleration {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter v0, v1, and t: ");

		// prikupi
		double startingVelocity = unos.nextDouble();
		double endingVelocity = unos.nextDouble();
		double timeSpan = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double acceleration = (endingVelocity - startingVelocity) / timeSpan;

		// serviraj rezultat
		System.out.printf("The average acceleration is %f", acceleration);

	}

}
