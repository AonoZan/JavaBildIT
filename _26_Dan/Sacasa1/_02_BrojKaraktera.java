import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _02_BrojKaraktera {
	// public scanner i metoda za zatvaranje scannera
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime fajla: ");
		java.io.File file = new java.io.File("Sacasa1/KarakteriFajl.txt");
		Scanner fileInput = new Scanner(file);
		StringBuffer line = new StringBuffer(fileInput.useDelimiter("\\Z").next());
		
		
		
		// od prvog malog slova do zadnjeg velikog (a-Z)
		for (int i = 65; i <= 122; i++) {
			// brojac slova na nuli za trenutno slovo
			int brojac = 0;
			// loop kroz citav string
			for(int j = 0; j < line.length(); j++){
				// ako je slovo u stringu jednak sa trenutnim slovom
				if(line.charAt(j) == (char)i){
					// povecaj brojac, izbrisi slovo iz stringa i smanji "j"
					// jer je duzina stringa manja kada se izbrise slovo
					brojac++;
					line.deleteCharAt(j);
					j--;
				}
			}
			// status
			if(brojac > 0)System.out.printf("%c appears %d time\n", (char)i, brojac);
			// ako je trenutno slovo zadnjeg velikog slova
			// prebaci ga na slovo ispred prvog malog slova
			if(i == 91 ) i = 96;
		}
		fileInput.close();
		closeScanner();
	}
}
