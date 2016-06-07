import java.util.Scanner;

public class Polidrom {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);

		// 
		System.out.println("Unesite jedan trocifreni cijeli broj: ");
		int trocifreniBroj = unos.nextInt();

		// zatvori scanner
		unos.close();
		
		int trocifreniNaopako = ((trocifreniBroj%10)*100) + ((trocifreniBroj/10%10)*10) + (trocifreniBroj/100);
		
		// provjeri jeli ili nije uneseni broj polidrom
		if (trocifreniBroj == trocifreniNaopako) {
			System.out.printf("Broj %d je polidrom.", trocifreniBroj);
			
		}else {
			System.out.printf("Broj %d nije polidrom.", trocifreniBroj);
		}
	}

}
