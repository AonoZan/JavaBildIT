import java.util.Scanner;

public class _07_NumberOfYears {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Enter the number of minutes: ");

		// prikupi
		int minutes = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		int years = minutes / 60 / 24 / 365;
		int days = (minutes / 60 / 24) % years;

		// serviraj rezultat
		System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);

	}

}
