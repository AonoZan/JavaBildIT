/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Mobitel {
	private String proizvodjac;
	private String model;
	private int brzinaProcesora;
	private int brojJezgriProcesora;
	private int kolicinaMemorije;
	private int kolicinaRamMemorije;
	private double brojMegapikselaKamere;
	private String[] nizInstaliranihAplikacija;
	
	private int brojInstaliranihAplikacija = 0;
	private boolean memorijska = false;
	
	Mobitel() {
		nizInstaliranihAplikacija = new String[20];
	}
	
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setBrzinaProcesora(int brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}
	public void setBrojJezgriProcesora(int brojJezgriProcesora) {
		this.brojJezgriProcesora = brojJezgriProcesora;
	}
	public void setKolicinaMemorije(int kolicinaMemorije) {
		this.kolicinaMemorije = kolicinaMemorije;
	}
	public void setKolicinaRamMemorije(int kolicinaRamMemorije) {
		this.kolicinaRamMemorije = kolicinaRamMemorije;
	}
	public void setBrojMegapikselaKamere(double brojMegapikselaKamere) {
		this.brojMegapikselaKamere = brojMegapikselaKamere;
	}
	
	public void ispisiSpecifikaciju() {
		System.out.printf(
				  "Proizvodjac: %s\n"
				+ "Model: %s\n"
				+ "Brzina procesora: %.2f (%d jezgri)\n"
				+ "Kolicina memorije: ram(%d) rom(%d)\n"
				+ "Camera: %.2f MP\n",
				this.proizvodjac,
				this.model,
				(this.brzinaProcesora/1000.0),
				this.brojJezgriProcesora,
				this.kolicinaRamMemorije,
				this.kolicinaMemorije,
				this.brojMegapikselaKamere);
	}
	public void instalirajAplikaciju(String aplikacija) {
		if (this.brojInstaliranihAplikacija+1 > 20) {System.out.println("Nije moguce instalirati aplikaciju. Izbrisi neku od aplikacija prvo."); return;}
		this.nizInstaliranihAplikacija[this.brojInstaliranihAplikacija] = aplikacija;
		this.brojInstaliranihAplikacija++;
	}
	public void obrisiAplikaciju(String aplikacija) {
		boolean aplikacijaPostoji = false;
		for (int i = 0; i < nizInstaliranihAplikacija.length; i++) {
			if (nizInstaliranihAplikacija[i] == aplikacija) {
				String tmp = nizInstaliranihAplikacija[brojInstaliranihAplikacija-1];
				nizInstaliranihAplikacija[brojInstaliranihAplikacija-1] = nizInstaliranihAplikacija[i];
				nizInstaliranihAplikacija[i] = tmp;
				aplikacijaPostoji = true;
				nizInstaliranihAplikacija[brojInstaliranihAplikacija-1] = "";
				brojInstaliranihAplikacija--;
			}
		}
		if (aplikacijaPostoji) {
			System.out.println("Aplikacija uklonjena.");
		}else {
			System.out.println("Aplikacija ne postoji.");
		}
	}
	public void ispisiInstaliraneAplikacije() {
		System.out.println("Lista instaliranih aplikacija:");
		for (int i = 0; i < nizInstaliranihAplikacija.length; i++) {
			System.out.printf("%s,\n", nizInstaliranihAplikacija[i]);
		}
	}
	public void ubaciSDKarticu(int memorijska) {
		if (!this.memorijska) {
			this.kolicinaMemorije += memorijska;
			this.memorijska = true;
		}
	}
}
