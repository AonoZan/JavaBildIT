package NaCasuPisano;
import java.util.Scanner;

public class FunteMarke {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Unesite neki iznos u funtama: ");

		// prikupi
		double funte = unos.nextDouble();

		// zatvori scanner
		unos.close();

		// izracunaj
		double marke = funte * 2.48;

		// serviraj rezultat
		System.out.println(funte + " funti iznosi " + marke + ".");

	}

}
