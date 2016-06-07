package Zadaca;
import java.util.Scanner;


public class Pdv {

	private static Scanner unos;

	public static void main(String[] args) {
		unos = new Scanner(System.in);
		
		// ispisi upit za neku cijenu
		System.out.print("Unesite vrijednost bez PDV-a: ");
		
		// skeniraj korisnicki unos
		int cijena = unos.nextInt();
		
		// izracunaj pdv i konacnu cijenu
		double pdv = (cijena / 100.0) * 17.0;
		double konacnaCijena = cijena + pdv;
		
		// ispisi rezultat
		System.out.println("\nVrijednost PDV-a je: " + pdv + ".\nKonacna cijena je: " + konacnaCijena + ".");
		

	}

}
