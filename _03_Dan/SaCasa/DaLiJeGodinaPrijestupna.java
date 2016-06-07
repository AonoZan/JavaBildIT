package NaCasuPisano;
import java.util.Scanner;

public class DaLiJeGodinaPrijestupna {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.print("Unesite neku godinu: ");

		// prikupi
		int godina = unos.nextInt();

		// zatvori scanner
		unos.close();

		if (((godina % 4) == 0) && ((godina % 100) != 0) || ((godina % 400) == 0)) {
			System.out.println("Godina je prijestupna.");
		} else {
			System.out.println("Godina nije prijestupna.");
		}

	}

}
