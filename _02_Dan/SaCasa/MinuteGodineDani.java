import java.util.Scanner;


public class MinuteGodineDani {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		
		// prikazi upit korisniku za neki broj minuta
		System.out.print("Unesite broj minuta: ");
		
		// prikupi unos od korisnika
		int minute = unos.nextInt();

		// zatvori scanner
		unos.close();
		
		// izracunaj godine i dane na osnovu korisnickog unosa minuta
		int godine = minute / (60 * 24 * 365);
		int ostatak = (minute % (60 * 24 * 365)) / (60 * 24); 
		
		// prikazi rezult korisniku
		System.out.println(minute + " minuta je otprilike " + godine + " godina i " + ostatak + " dana.");
		
		
	}

}
