/**
 * @autor Dejan Petrovic
 */
import java.util.Scanner;

public class Default {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("");

		// prikupi
		double value = unos.nextDouble();
		int integer = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		int nista = 2 + 4;

		// serviraj rezultat
		System.out.println("Something " + value
						+ ".\nSomething else " + integer + nista + ".");

	}

}
