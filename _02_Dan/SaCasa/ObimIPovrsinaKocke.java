import java.util.Scanner;


public class ObimIPovrsinaKocke {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		
		// prikazi upit korisniku za duzinu ivice
		System.out.print("Unesite duzinu ivice kocke u cm: ");
		
		// prikupi unos od korisnika
		double duzinaIvice = unos.nextDouble();

		// zatvori scanner
		unos.close();
		
		// izracunaj obim i povrsinu kocke
		double obim = 12 * duzinaIvice;
		double povrsina = 6 * (duzinaIvice * duzinaIvice); 
		
		// prikazi rezult korisniku
		System.out.println("Obium kocke cija je ivica " + duzinaIvice + " cm iznosi: " + obim + " cm");
		System.out.println("Povrsina kocke cija je ivica " + duzinaIvice + " cm iznosi: " + povrsina + " cm na kvadrat");
		
	}

}
