import java.util.Scanner;

public class ZbirTriNasumicna {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		int broj1 = (int)(Math.random() * 10);
		int broj2 = (int)(Math.random() * 10);
		int broj3 = (int)(Math.random() * 10);
		
		// 
		System.out.printf("Zbir %d + %d + %d je?", broj1, broj2, broj3);

		// prikupi
		int korisnikovZbir = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		int zbir = broj1 + broj2 + broj3;

		// serviraj rezultat
		if (zbir == korisnikovZbir) {
			System.out.println("Odgovor je tacan.");
		}else {
			System.out.println("Odgovor nije tacan.");
		}
	}

}
