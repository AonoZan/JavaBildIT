/**
 * @autor Dejan Petrovic
 */
import java.util.Scanner;

public class AverageSpeedInKilometers {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// prikazi poruku korisniku da unese podatke
		System.out.println("Unesite koliko ste pretrcali milja,\n za koliko sati, minuta i sekundi.\n" +
				"Na primjer 24 1 40 35.");

		// prikupi milje sate minute i sekunde
		double milje = unos.nextDouble();
		int sati = unos.nextInt();
		int minute = unos.nextInt();
		int sekunde = unos.nextInt();

		// zatvori scanner
		unos.close();

		// 1 kilometar ima 1.6 milja
		// kilometre podjeli sa vremenom
		double predjeniKilometri = milje / 1.6;
		double prosjecnaBrzinaUKilometrima = predjeniKilometri / (sati + (minute / 60.0) + (sekunde / 60.0 / 60.0));

		// serviraj rezultat
		System.out.printf("\n Vasa prosjecna brzina je %fkm/h.", prosjecnaBrzinaUKilometrima);

	}

}
