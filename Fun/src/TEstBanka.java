//////////////////////////////////////////////////////////
//////////////////  RACUN   //////////////////////////////
/////////////////////////////////////////////////////////

class Racun {

	private int brojRacuna;
	private static int IDRacuna = 100000;
	private String ime;
	private double iznosNaRacunu;

	public Racun() {

	}

	public Racun(String ime, double iznosNaRacunu) {
		this.ime = ime;
		this.iznosNaRacunu = iznosNaRacunu;
		IDRacuna++;
		brojRacuna = IDRacuna;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getIznosNaRacunu() {
		return iznosNaRacunu;
	}

	public void setIznosNaRacunu(double iznosNaRacunu) {
		this.iznosNaRacunu = iznosNaRacunu;
	}

	public int getBrojRacuna() {
		return this.brojRacuna;
	}

	@Override
	public String toString() {
		return "Broj racuna = " + brojRacuna + ", Ime = " + ime
				+ ", Iznos na racunu = " + iznosNaRacunu + ".";
	}

}
////////////////////////////////////////////////////////////////////////
/////////////////////////////  TRANSFER  //////////////////////////////
/////////////////////////////////////////////////////////////////////

class Transfer {

//	int srcAccount;
//	int trgAccount;
	Racun srcRacun;
	Racun trgRacun;

	public Transfer(Racun srcRacun, Racun trgRacun) {
		this.srcRacun = srcRacun;
		this.trgRacun = trgRacun;
	}

	public int getSRCAccount() {
//		return srcAccount = srcRacun.getBrojRacuna();
		return srcRacun.getBrojRacuna();
	}

	public int getTRGAccount() {
//		return trgAccount = trgRacun.getBrojRacuna();
		return trgRacun.getBrojRacuna();
	}

	public void transfer(double iznosZaTransfer) {
		double iznosNaRacunuSRC = srcRacun.getIznosNaRacunu();
		double iznosNaRacunuTRG = trgRacun.getIznosNaRacunu();

		if (iznosNaRacunuSRC > iznosZaTransfer) {
			iznosNaRacunuSRC = iznosNaRacunuSRC - iznosZaTransfer;
			iznosNaRacunuTRG = iznosNaRacunuTRG + iznosZaTransfer;
			srcRacun.setIznosNaRacunu(iznosNaRacunuSRC);
			trgRacun.setIznosNaRacunu(iznosNaRacunuTRG);
		} else
			System.out.println("Nemate dovoljno na racunu za ovu transakciju");
	}

	@Override
	public String toString() {
		return "Transfer [Broj izvornog racuna: " + getSRCAccount()
				+ ", Broj racuna za transfer: " + getTRGAccount() + "\n"
				+ "\n Stanje racuna " + getSRCAccount() + " korisnika "
				+ srcRacun.getIme() + " je " + srcRacun.getIznosNaRacunu()
				+ "\n Stanje racuna " + getTRGAccount() + " korisnika "
				+ trgRacun.getIme() + " je " + trgRacun.getIznosNaRacunu();
	}
}

/////////////////////////////////////////////////////////////////////////////
//////////////////////////////  TEST  ///////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////



public class TEstBanka {

	public static void main(String[] args) {

		Racun racun1 = new Racun("Pavle", 200);
		Racun racun2 = new Racun("Dejan", 220);
		
		Transfer transakcija = new Transfer(racun2, racun1);

		System.out.println("Stanje na racunima prije transakcije: ");
		System.out.println();
		System.out.println(racun1.toString());
		System.out.println(racun2.toString());

		transakcija.transfer(20);
		System.out.println();
		System.out.println("Stanje na racunima poslije izvrsene transakcije.");
		System.out.println();
		System.out.println(racun1.toString());
		System.out.println(racun2.toString());
//		System.out.println(transakcija.toString());
	}
}