public class printFramesPerSecond {
	public static void fpsLag(int milliseconds){
		try {									// Iskreno nemam pojma zasto u Javi se "sleep()" mora
			Thread.sleep(milliseconds);			// staviti u try:catch...
		} catch (Exception e) {					// kod sam nasao negdje na netu i pomirio se sa time
			return;								// jer moj prvi pokusaj nije upalio...
		}										// Uglavnom ova metoda pauzira racunar za "int milliseconds" milisekundi
	}
	public static void main(String[] args) {
		int frameEveryMillisecond = 250;		// brzina prikazivanja slike, 250 znaci svake 250 mlisekunde sto je 4 fps
		int screenSize = 4;						// velicina animacije, za jednostavnost sam ostavio 4(promjeni u veci broj)		
		char activePixel = 'o';					// prikaz aktivnog piksela na ekranu, moze biti bilo koje slovo, znak, broj, itd...
		char inactivePixel = ' ';				// neaktivan piksel, moze biti bilo koji znak ali je bolje ostaviti kao prazno polje
		String newFrame = "\n\n\n\n\n\n\n\n"	// veoma, veoma prljav nacin da se ostvari citav ovaj program...
				+ "\n\n\n\n\n\n\n\n"			// nakon svakih 250 milisekundi i ispisivanja slike odnosno frejma potrebno je izbrisati taj frejm
				+ "\n\n\n\n\n\n\n\n";			// ali posto je to u Eclipse to nemoguce ovo je hack koji ispisuje gomilu novih redova i daje iluziju ciste konzole
		// beskonacan loop jer je i uvjek nejednako -1 
		for (int i = 0; i != -1; i++) {
			// konzola mora cista i bijela...
			System.out.print(newFrame);
			// kreiraj frejm sa pikselima u duzini "screenSize"
			for (int j = 0; j < screenSize; j++) {
				// ostatak trenutnog frejma i velicine ekrana je uvjek aktivan piksel ili piksel ispred njega ili ako je to zadnji piksel onda je i prvi aktivan
				if (i%screenSize == j || i%screenSize+1 == j || i%screenSize-(screenSize-1) == j) {
					System.out.print(activePixel);
				// ako nije onda printaj prazan piksel
				}else {
					System.out.print(inactivePixel);
				}
			}
			// sacekaj malo...
			fpsLag(frameEveryMillisecond);
		}
	}

}

//  4  5  6  7
//  8  9 10 11
//  0  1  2  3
//
//  1  1  0  0   0
//  0  1  1  0   1
//  0  0  1  1   2
//  1  0  0  1   3
//  
