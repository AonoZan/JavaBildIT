/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Laptop extends Racunar {
	private double trajanjeBaterije;
	Laptop (){
	}
	Laptop(Racunar racunar, double trajanjeBaterije) {
		this.setKolicinaRama(racunar.getKolicinaRama());
		this.setKapacitetHD(racunar.getKapacitetHD());
		this.setBrzinaProcesora(racunar.getBrzinaProcesora());
		this.setDijagonalaMonitora(racunar.getDijagonalaMonitora());
		this.setNabavnaCijena(racunar.getNabavnaCijena());
		
		this.trajanjeBaterije = trajanjeBaterije;
	}
	public double getTrajanjeBaterije() {
		return trajanjeBaterije;
	}
	public void setTrajanjeBaterije(double trajanjeBaterije) {
		this.trajanjeBaterije = trajanjeBaterije;
	}

	public double izracunajCijenu() {
		return super.getNabavnaCijena() + ((super.getNabavnaCijena() / 100) * 15);
	}
	public String toString() {
		return "\nRacunar:"
				+ "\n\tcpu: "
				+ this.getBrzinaProcesora()
				+ "\n\tram: "
				+ this.getKolicinaRama()
				+ "\n\trom: "
				+ this.getKapacitetHD()
				+ "\n\tdiagonal: "
				+ this.getDijagonalaMonitora()
				+ "\n\tprice: "
				+ this.izracunajCijenu();
		
	}
}
