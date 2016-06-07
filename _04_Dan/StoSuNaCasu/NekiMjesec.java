import java.util.Scanner;

public class NekiMjesec {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesite neki broj izmedju 1 i 12: ");
		int uneseniBroj = unos.nextInt();
		String mjesec = "";
		

		// zatvori scanner
		unos.close();

		// izracunaj
		switch (uneseniBroj) {
		case 1:
			mjesec = "januar";
			break;
		case 2:
			mjesec = "februar";
			break;
		case 3:
			mjesec = "mart";
			break;
		case 4:
			mjesec = "april";
			break;
		case 5:
			mjesec = "maj";
			break;
		case 6:
			mjesec = "jun";
			break;
		case 7:
			mjesec = "jul";
			break;
		case 8:
			mjesec = "avgust";
			break;
		case 9:
			mjesec = "septembar";
			break;
		case 10:
			mjesec = "oktobar";
			break;
		case 11:
			mjesec = "novembar";
			break;
		case 12:
			mjesec = "decembar";
			break;
		default:
			mjesec = "N/A";
			break;
		}
		System.out.println("Izabrani mjesec je: " + mjesec);
	}

}
