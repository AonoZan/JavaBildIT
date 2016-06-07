/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Utakmica {
	private String domaciTim;
	private String gostujuciTim;
	private int brojPosjetilaca;
	private double cijenaKarata;
	private String rezultat;
	
	Utakmica() {
		System.out.println("Utakmica je pocela.");
	}

	public String getDomaciTim() {
		return domaciTim;
	}
	public void setDomaciTim(String domaciTim) {
		this.domaciTim = domaciTim;
	}
	public String getGostujuciTim() {
		return gostujuciTim;
	}
	public void setGostujuciTim(String gostujuciTim) {
		this.gostujuciTim = gostujuciTim;
	}
	public int getBrojPosjetilaca() {
		return brojPosjetilaca;
	}
	public void setBrojPosjetilaca(int brojPosjetilaca) {
		this.brojPosjetilaca = brojPosjetilaca;
	}
	public double getCijenaKarata() {
		return cijenaKarata;
	}
	public void setCijenaKarata(double cijenaKarata) {
		this.cijenaKarata = cijenaKarata;
	}
	public String getRezultat() {
		return rezultat;
	}
	public void setRezultat(String rezultat) {
		this.rezultat = rezultat;
	}
	
	public void ispisStanjaUtakmice() {
		System.out.printf("%s (%s) %s", domaciTim, rezultat, gostujuciTim);
	}
	public double izracunajZaraduOdProdajeKarata() {
		return brojPosjetilaca * cijenaKarata;
	}
	public void ispisZaradeOdProdajeKarata() {
		System.out.printf("Zarada od prodaje karata iznosi: %.2f", izracunajZaraduOdProdajeKarata());
	}
}
