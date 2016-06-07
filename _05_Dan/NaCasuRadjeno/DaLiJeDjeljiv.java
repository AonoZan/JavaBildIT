import java.util.Scanner;

public class DaLiJeDjeljiv {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesite neki cijeli broj: ");

		// prikupi
		int cijeliBroj = unos.nextInt();

		// zatvori scanner
		unos.close();

		// izracunaj
		if (((cijeliBroj % 2) == 0) && ((cijeliBroj % 3) == 0)) {
			System.out.printf("%d broj je djeljiv sa 2 i 3.", cijeliBroj);
		}else {
			System.out.printf("%d broj nije djeljiv sa 2 i 3.", cijeliBroj);
		}
	}

}
