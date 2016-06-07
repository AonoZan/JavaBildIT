import java.util.Scanner;

public class _3_NajveciUnos {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesite nekoliko brojeva, nula prekida unos: ");
		int broj = unos.nextInt();
		int trenutniNajveci = 0;
		int brojTrenutnihNajvecih = 1;

		

		// izracunaj
		while (broj != 0) {
			if (broj > trenutniNajveci) {
				trenutniNajveci = broj;
				brojTrenutnihNajvecih = 1;
			}else if (broj == trenutniNajveci) {
				brojTrenutnihNajvecih++;
			}
			System.out.print("Unesite jos jedan broj: ");
			broj = unos.nextInt();
			
		}
		
		// zatvori scanner
		unos.close();
		
		
		System.out.printf("Broj %d j najveci u datom nizu i ponavlja se %d puta.", trenutniNajveci, brojTrenutnihNajvecih);

	}

}
