/**
 * @autor Dejan Petrovic 2016
 */
import java.util.Scanner;

public class DisplayAPattern {

	public static void main(String[] args) {
		// kreiraj scanner
		Scanner unos = new Scanner(System.in);
		
		// kolekcija grafickog prikazivanja slova
		// otprilike kao pikseli na ekranu
		// prvi unos u kolekciji je indeks svih slova u kolekciji
		String[][] slova = { {"qwertzuiopasdfghjklyxcvbnm.,_"}
				,{ "111 ", "1 1 ", "1 1 ", "1111"} //Q
				,{ "1  1  1", " 1 1 1 ", "  1 1  ", "  1 1  "} //W
				,{ "1111", "111 ", "1   ", "1111"} //E
				,{ "1111 ", "1  11", "111  ", "1  11"} //R
				,{ "11111", "  1  ", "  1  ", "  1  "} //T
				,{ "1111", "  1  ", " 1  ", "1111"} //Z
				,{ "1  1", "1  1", "1  1", "1111"} //U
				,{ "111", " 1 ", " 1 ", "111"} //I
				,{ "1111", "1  1", "1  1", "1111"} //O
				,{ "1111", "1  1", "111 ", "1   "} //P
				
				,{ "   1   ", "  1 1  ", " 11111 ", "1     1"} //A
				,{ " 111", "11  ", "  11", "111 "} //S
				,{ "111 ", "1  1", "1  1", "111 "} //D
				,{ "1111", "1   ", "11  ", "1   "} //F
				,{ " 111", "1   ", "1  1", "1111"} //G
				,{ "1  1", "1  1", "1111", "1  1"} //H
				,{ "   1", "   1", "1  1", " 11 " } //J
				,{ "1 11", "11  ", "1 1 ", "1  1"} //K
				,{ "1  ", "1  ", "1  ", "111"} //L
				
				,{ "1   1", " 1 1 ", "  1  ", "  1  "} //Y
				,{ "1  1", " 11 ", " 11 ", "1  1"} //X
				,{ " 111", "1   ", "1   ", " 111"} //C
				,{ "1     1", " 1   1 ", "  1 1  ", "   1   "} //V
				,{ "111 ", "111 ", "1  1", "111 "} //B
				,{ "1  1", "11 1", "1 11", "1  1"} //N
				,{ "1  1", "1111", "1  1", "1  1"} //M
				,{ "  ", "  ", "11", "11"} //.
				,{ "  ", "  ", "  ", "11"} //,
				,{ "  ", "  ", "  ", "  "} //_
		};
		
		// prikazi upit za neku rijec ili recenicu
		System.out.print("Unesite neku rijec ili recenicu: ");
		
		// prikupi rjec
		String rijec = unos.nextLine().toLowerCase().replaceAll(" ", "_");
		
		// zatvori scanner
		unos.close();
		
		StringBuilder guiString = new StringBuilder();
		
		// ponovi onoliko puta koliko ima jedno slovo redova
		for (int redovi = 0; redovi < 4; redovi++) {
			
			// prikupi citav red za sva slova u varijabli rijec
			for (int kolone = 0; kolone < rijec.length(); kolone++) {
				
				// prikupi trenutni znak i rijeci
				String tempChar = Character.toString(rijec.charAt(kolone));
				
				if (tempChar != "_" ) {
					// prikupi kolonu slova na osnovu trenutnog reda
					String tempKolone = slova[slova[0][0].indexOf(rijec
							.charAt(kolone)) + 1][redovi];
					// dodaj u finalnu rijec ali zamjeni 1 sa trenutnim znakom
					guiString.append(tempKolone.replaceAll("1",
							tempChar.toUpperCase()));
				}
				
				// dodaj odvojeno na kraju svake kolone bilo kojeg slova
				guiString.append( " " );
			}
			// dodaj specijalni znak da bi prebacio u novi red na kraju svakog reda
			guiString.append( "\n" );
		}
		
		System.out.println(guiString);

	}

}
