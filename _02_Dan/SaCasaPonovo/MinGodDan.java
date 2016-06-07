import java.util.Scanner;

public class MinGodDan {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese broj minuta
		System.out.print("Unesite broj minuta: ");
		
		// prikupi neki broj minuta od korisnika
		int minute = unos.nextInt();

		// zatvori scanner
		unos.close();
		
		// izracunaj dane i godine
		int godine = minute / (60 * 24 * 365);
		int dani = (minute % (60 * 24 * 365)) / (60 * 24);
		
		// prikazi finalni rezultat
		System.out.println(minute + " minuta je " + godine + " godina i " + dani + " dana.");

	}

}
