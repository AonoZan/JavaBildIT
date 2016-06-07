package NaCasuPisano;
import java.util.Scanner;

public class NulaDoSto {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Unesite jedan broj od 0 do 100");

		// prikupi
		int brojBodova = unos.nextInt();

		// zatvori scanner
		unos.close();

		if ((brojBodova >= 90) && (brojBodova <= 100) ) {
			System.out.println("Vasa ocjena je 10.");
		}
		if ((brojBodova >= 80) && (brojBodova <= 89) ) {
			System.out.println("Vasa ocjena je 9.");
		}

		if ((brojBodova >= 70) && (brojBodova <= 79) ) {
			System.out.println("Vasa ocjena je 8.");
		}

		
		if ((brojBodova >= 60) && (brojBodova <= 69) ) { 
			System.out.println("Vasa ocjena je 7.");
		}

		if ((brojBodova >= 50) && (brojBodova <= 59) ) {
			System.out.println("Vasa ocjena je 6.");
		}

		if ((brojBodova >= 0) && (brojBodova <= 49) ) {
			System.out.println("Vi niste polozili test.");
		}


	}

}
