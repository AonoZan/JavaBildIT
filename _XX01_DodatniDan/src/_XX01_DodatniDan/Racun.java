/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _XX01_DodatniDan;

public class Racun {
	private int brojRacuna;
	private String  ime;
	private int brojPosudjenihKnjiga;
	
	Racun(int brojRacuna, String ime){
		this.brojRacuna = brojRacuna;
		this.ime = ime;
		this.brojPosudjenihKnjiga = 0;
	}
	
	public int getBrojRacuna() {
		return brojRacuna;
	}

	public String getIme() {
		return ime;
	}

	public int getBrojPosudjenihKnjiga() {
		return brojPosudjenihKnjiga;
	}

	int posudiKnjigu(){
		return 0;
	}
	public void povecajBrojKnjiga(){
		this.brojPosudjenihKnjiga++;
	}
	public void smanjiBrojKnjiga(){
		this.brojPosudjenihKnjiga--;
	}
	public String toString(){
		return "Ime racuna: " + ime;
	}
}
