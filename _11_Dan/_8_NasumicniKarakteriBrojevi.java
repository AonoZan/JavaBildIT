import java.util.Scanner;

public class _8_NasumicniKarakteriBrojevi {
	public static String nasumicnaVelikaSlova(int duzinaStringa){
		String string = "";
		for (int i = 0; i < duzinaStringa; i++) {
			char nasumicanKarakter = (char)('A' + (int)(Math.random() * (int)('Z' - 'A' + 1)) );
			string = string + nasumicanKarakter;
		}
		return string;
	}
	public static String nasumicniBrojevi(int duzinaStringa){
		String string = "";
		for (int i = 0; i < duzinaStringa; i++) {
			char nasumicanKarakter = (char)('0' + (int)(Math.random() * (int)('9' - '0' + 1)) );
			string = string + nasumicanKarakter;
		}
		return string;
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite koliko zelite nasumicnih znakova po liniji: ");
		int duzinaLinije = 10;//unos.nextInt();
		unos.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(nasumicnaVelikaSlova(duzinaLinije));
			System.out.println(nasumicniBrojevi(duzinaLinije));
		}
	}

}
