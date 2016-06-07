package Zadaca;
import java.util.Scanner;


public class SekundeMinute {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// ispisi upit za neki broj sekundi
		System.out.print("Unesite broj sekundi: ");
		
		// prikupi unos
		int sekunde = unos.nextInt();

		// zatvori scanner
		unos.close();
		
		// izracunaj broj minuta i ostatak
		int minute = sekunde / 60;
		int ostatak = sekunde % 60;
		
		// prikazi rezultat
		System.out.println(sekunde + " sekudi je " + minute + " minuti i " + ostatak + " sekundi.");

	}

}
