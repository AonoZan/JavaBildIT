/**
 * @autor Dejan Petrovic
 */
public class SummationOfASeries {

	public static void main(String[] args) {
		
		// ipremi varijablu rezultat da bi se mogla kasnije koristitipro
		int rezultat = 1;
		
		// obrni od 2 do 9 puta
		// i dodaj na rezultat broj obrtaja
		for (int i = 2; i != 9 + 1; i++) {
			rezultat += i;
		}
		
		// serviraj rezultat
		System.out.println(rezultat);

	}

}
