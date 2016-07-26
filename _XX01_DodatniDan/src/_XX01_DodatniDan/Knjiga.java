/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _XX01_DodatniDan;

public class Knjiga {
	private int brojKnjige;
	private String imeKnjige;
	private boolean status = true;
	Knjiga(int brojKnjige, String imeKnjige){
		this.brojKnjige = brojKnjige;
		this.imeKnjige = imeKnjige;
	}
	public int getBrojKnjige() {
		return brojKnjige;
	}
	public String getImeKnjige() {
		return imeKnjige;
	}
	public boolean isStatus() {
		return status;
	}
	public void setBrojKnjige(int brojKnjige) {
		this.brojKnjige = brojKnjige;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
