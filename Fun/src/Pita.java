/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Pita {
	int kakavJeKuhar;
	String koreZaPitu = "nekim tamo korama iz Konzuma.";
	String sastojciZaFill = "sir";
	int vrjemeZaZavijanje = 15;//minuta
	
	String[] radnje = {"mjesam, ", "dodajem, \n", "provjeravam, ", "smor, ", "sjeckam, ", 
						"mutim, ", "sapinica na tv!, ", "provjeravam, \n", "smor, \n", };
	
	Pita(){
	}
	Pita(String sastojciZaFill){
		this.sastojciZaFill = sastojciZaFill;
	}
	public void napraviPitu(String sastojciZaFill){										// pravljenje pite
		pripremiFill("jabuke", vrjemeZaZavijanje);										// prvo fill sa sastojcima i vremenom da se to ripremi
		zavijPitu();																	// potom se to zavije
		peciPitu();																		// i ispece
	}
	public void napraviPitu(){															//
		System.out.printf("\nPravim pitu \n\nSastojci: %s.\n\n", sastojciZaFill); 		//
		pripremiFill(this.sastojciZaFill, vrjemeZaZavijanje);							//
		zavijPitu();																	//
		peciPitu();																		// 
	}
	public boolean pripremiFill(String sastojci, int kolikoDugoTrebaZaPripremanje){		// pripremaj fill sa sastojcima neko vrjeme
		System.out.println("Pravim fill za pitu."); 									//
		boolean fill = false;															// fill nije jos uvjek napravljen...
		int stoperica = 0;																// stoperica na nuli
		System.out.printf("Dodajem %s u fill.\n", sastojci);
		while (stoperica != kolikoDugoTrebaZaPripremanje) {								// dok stoperica ne pokaze da je proslo dovoljno vremenea
			System.out.printf("%s",radnje[(int)(Math.random() * radnje.length)]);		// fill se priprema
			stoperica++;																// vrjeme tece...
		}
		System.out.println("gotovo je sa fillom.");fill = true;							// gotovo je sa fillom
		return fill;																	// vrati fill
	}
	public boolean zavijPitu(){															// treba zaviti pitu
		System.out.printf("Zavijam pitu sa %s.\n", koreZaPitu);							// 
		boolean neDosadi = false;														// nije mi jos dosadilo
		while(!neDosadi){																// dok ne ne dosadi...
			switch ((int)(Math.random()*10+1)) {										// u neko vrjeme potrebno za zavijanje pite
			case 6:																		// ako je mozda u pola vremena
				System.out.println("Dosadilo mi zavijati pitu. Nek bude kako hoce...");	// dosadilo mi zavijati
				neDosadi = true;														//
				break;																	// prekidaj!!!
			case 10:																	// ako je na kraju vremena
				System.out.println("Pita je zavijena.");								// pita je zavijena
				neDosadi = true;														// i dosadilo mi je sigurno
				break;																	// 
			}
		}
		return true;																	// gotovo je uglavnom...
	}
	public String peciPitu(){															// treba ispeci pitu
		System.out.println("Pecem pitu."); 												// ...pa peci sta cekas
		kakavJeKuhar = (int)(Math.random() * 5 + 1);									// neki kuhar je za desetku a neki ni nulu ne zasluzuje
		switch (kakavJeKuhar) {															// ako je kuhar...
		case 5:																			// kojim slucajem za desetku
			System.out.println("Pita je gotova i ko dusa je...");						//
			break;
		case 1:																			// ako je slabiji
			System.out.println("Pita je gotova i nedo bog...");							//
			break;
		default:																		// po defaultu pita more proc
			System.out.println("Pita je gotova i nije losa...");						//
			break;
		}
		return " ";
	}
	
}
