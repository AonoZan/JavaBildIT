import java.util.Scanner;

public class _2_JedanUDrugom {

			public static void main(String[] args) {
				// create scanner
				Scanner unos = new Scanner(System.in);
				
				System.out.print("Unesite dvije rijeci: ");
				
				String prvaRijec = unos.next();
				String drugaRijec = unos.next();
				
				unos.close();
				
				if (prvaRijec.contains(drugaRijec)) {
					System.out.printf("%s postoji u %s.", drugaRijec, prvaRijec);
				}
				
				// System.out.println(prvaRijec + "  " + drugaRijec);
				
		
	}
}
