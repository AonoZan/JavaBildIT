/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _XX01_DodatniDan;

import java.util.Date;

public class Posudjivanje {
	private int brojRacuna;
	private int brojKnjige;
	private Date datum;
	
	Posudjivanje(int brojRacuna, int brojKnjige){
		this.brojRacuna = brojRacuna;
		this.brojKnjige = brojKnjige;
		this.datum = new Date();
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}
	public int getBrojKnjige() {
		return brojKnjige;
	}
	public Date getDatum() {
		return datum;
	}
	
}
