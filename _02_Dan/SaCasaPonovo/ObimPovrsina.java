import java.util.Scanner;

public class ObimPovrsina {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// prikazi upit korisniku da unese duzinu ivice kocke
		System.out.print("Duzinu ivice kocke: ");
		
		// prikupi unos od korisnika
		double ivicaDuzina = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj obim i povrsinu kocke
		double obim = ivicaDuzina * 12;
		double povrsina = (ivicaDuzina * 6) * (ivicaDuzina * 6); // nije tacno
		double povrsina1 = 6 * (ivicaDuzina * ivicaDuzina);      // formula je 6a^2 a ne (6a)^2
		
		// prikazi finalni rezultat
		System.out.println("Obim kocke iznosi: " + obim + ".\nPovrsina kocke iznosi: " + povrsina + "." + povrsina1);

	}

}
