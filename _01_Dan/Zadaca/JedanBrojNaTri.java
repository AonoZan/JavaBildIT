package Zadaca;
import java.util.Scanner;


	public class JedanBrojNaTri {

		public static void main(String[] args) {
			// kreiraj scanner
			Scanner unos = new Scanner(System.in);
			
			// ispisi upit za jedan broj izmedju 0 - 999
			System.out.print("Unesite jedan broj od 0 do 999: ");
			
			// prikupi unos
			int broj = unos.nextInt();
			
			// zatvori scanner
			unos.close();
			
			// izracunaj zbir
			int rezultat = (broj/100)
						 + (broj/10 - (broj/100) * 10)
						 + (broj - ((broj/100)*100) - ((broj/10 - (broj/100) * 10) * 10));
			
			// prikazi rezultat
			System.out.println("Rezultat je:" + rezultat + ".");
					
		}

	}
