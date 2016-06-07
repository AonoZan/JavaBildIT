/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class PiteNaVagu {

	public static void main(String[] args) {
		Pita odJabuka = new Pita("jabuke");
		odJabuka.koreZaPitu = "specijalnim skupim korama ^^.";
		odJabuka.napraviPitu();
		
		Pita poDefaultu = new Pita();
		poDefaultu.napraviPitu();
	}

}
