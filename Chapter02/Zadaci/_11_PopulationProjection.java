import java.util.Scanner;

public class _11_PopulationProjection {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Enter the number of years: ");

		// prikupi
		int nextFewYears = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		double yearSeconds = 365*24*60*60;
		
		double yearBirth = yearSeconds / 7.0;
		double yearDeath = yearSeconds / 13.0;
		double yearImmigrant = yearSeconds / 45.0;
		double yearLifeForms = yearBirth - yearDeath + yearImmigrant;

		double currentYearLifeForms = 312364860;//312032487
		double poppulationInFewYears = currentYearLifeForms + (yearLifeForms * nextFewYears);
		
		// serviraj rezultat
		System.out.printf("The population in 5 years is %d", (int)(poppulationInFewYears));

	}

}
