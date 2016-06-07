/**
 * @autor Dejan Petrovic
 */
public class PrintATable {

	public static void main(String[] args) {
		
		// prva linija koja je samo tu samo zbog estetskog izgleda
		System.out.println("a    a^2  a^3");
		
		// obrni neki broj puta
		// i svakog puta trenutni broj obrtaja ispisi
		for (int i = 1; i < 4; i++) {
			System.out.printf("%-3d  %-3d  %-3d\n", i ,i*i, i*i*i);
			
		}

	}

}
