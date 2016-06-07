/**@autor AonoZan Dejan Petrovic 2016 ©
 */
/*
 * 
 */
public class Racunar {
	private double kolicinaRama;
	private double kapacitetHD;
	private double brzinaProcesora;
	private double dijagonalaMonitora;
	private double nabavnaCijena;
	Racunar() {
		
	}
	Racunar(double kolicinaRama, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora, double nabavnaCijena) {
		this.kolicinaRama = kolicinaRama;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}
	public double izracunajCijenu() {
		return nabavnaCijena + ((nabavnaCijena / 100) * 10);
	}
	public double getKolicinaRama() {
		return kolicinaRama;
	}
	public double getKapacitetHD() {
		return kapacitetHD;
	}
	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}
	public double getDijagonalaMonitora() {
		return dijagonalaMonitora;
	}
	public double getNabavnaCijena() {
		return nabavnaCijena;
	}
	public void setKolicinaRama(double kolicinaRama) {
		this.kolicinaRama = kolicinaRama;
	}
	public void setKapacitetHD(double kapacitetHD) {
		this.kapacitetHD = kapacitetHD;
	}
	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}
	public void setDijagonalaMonitora(double dijagonalaMonitora) {
		this.dijagonalaMonitora = dijagonalaMonitora;
	}
	public void setNabavnaCijena(double nabavnaCijena) {
		this.nabavnaCijena = nabavnaCijena;
	}
	
}
