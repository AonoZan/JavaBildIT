import java.util.Scanner;

public class PismoGlava {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		System.out.println("pismo = 0\nglava = 1");
		System.out.println("Unesite ishod bacanja novčica.");
		
		// prikupi
		int kosrisnickiUnos = unos.nextInt();

		// zatvori scanner
		unos.close();

		// nasumično nadji pismo ili glavu (0 ili 1)
		int nasumicniUnos = (int) (Math.random()*2);

		System.out.printf("Vi ste izabrali %d a racunar %d.\n", kosrisnickiUnos, nasumicniUnos);
		if (kosrisnickiUnos == nasumicniUnos) {
			System.out.println("Pobjedili ste!");
		}else {
			System.out.println("Niste pobjedili!");
		}
	}

}
