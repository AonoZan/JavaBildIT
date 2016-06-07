import java.util.Scanner;

public class _10_CalculateEnergy {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// get stuff
		System.out.print("Enter the amount of water in kilograms: ");
		double waterMass = unos.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double waterInitialTemperature = unos.nextDouble();
		System.out.print("Enter the final temperature: ");
		double waterFinalTemperature = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double requiredEnergy = waterMass * (waterFinalTemperature - waterInitialTemperature) * 4184;

		// serviraj rezultat
		System.out.printf("The energy needed is %.1f", requiredEnergy);

	}

}
