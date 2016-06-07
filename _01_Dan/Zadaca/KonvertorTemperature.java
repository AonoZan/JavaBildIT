package Zadaca;
import java.util.Scanner;


	public class KonvertorTemperature {

		public static void main(String[] args) {
			// kreiraj scanner
			Scanner unos = new Scanner(System.in);
			
			// ispisi upit za temperaturu u celzjusima
			System.out.print("Unesite trenutnu temperaturu u vasem mjestu: ");
			
			// prikupi unos
			int celzijusi = unos.nextInt();

			// zatvori scanner
			unos.close();
			
			// konvertuj temperaturu
			double farenhajti = (9.0 / 5) * celzijusi + 32;
			
			// prikazi rezultat
			System.out.println(celzijusi + " u celzijusa iznosi " + farenhajti + " u farenhajtima.");

		}

	}
