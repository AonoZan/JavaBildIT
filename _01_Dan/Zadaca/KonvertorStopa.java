package Zadaca;
import java.util.Scanner;


	public class KonvertorStopa {

		public static void main(String[] args) {
			// kreiraj scanner
			Scanner unos = new Scanner(System.in);
			
			// ispisi upit za broj stopa
			System.out.print("Unesite broj stopa: ");
			
			// prikupi unos
			double stope = unos.nextDouble();

			// zatvori scanner
			unos.close();
			
			// konvertuj stope u metre
			double metri = stope * 0.305;
			
			// prikazi rezultat
			System.out.println(stope + " stopam je " + metri + " metara.");

		}

	}
