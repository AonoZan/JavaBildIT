import java.util.Scanner;

public class Napojnica {

	private static Scanner unos;

	public static void main(String[] args) {
		unos = new Scanner(System.in);

		
		// ispisi upit za cijenu racuna
		System.out.print("Unesite iznos racuna u KM: ");

		// skeniraj korisnicki unos
		double racun = unos.nextDouble();

		// ispisi upit za cijenu racuna
		System.out.print("Unesite napojnicu u procentima: ");

		// skeniraj korisnicki unos
		double napojnicaProcenat = unos.nextDouble();
		

		// izracunaj napojnicu i ukupan iznos racuna
		double napojnica = (racun / 100.0) * napojnicaProcenat;
		double racunUkupno = racun + napojnica;

		// ispisi rezultat
		System.out.println("Iznos napojnice: " + napojnica
				+ ".\nUkupan iznos racuna: " + racunUkupno + ".");

	}

}
