/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestMobitel {

	public static void main(String[] args) {
		Mobitel mojMobitel = new Mobitel();
		
		mojMobitel.setProizvodjac("Lenovo");
		mojMobitel.setModel("K50-5");
		
		mojMobitel.setBrzinaProcesora(1700);//Mhz
		mojMobitel.setBrojJezgriProcesora(8);
		
		mojMobitel.setKolicinaMemorije(32);//GB
		mojMobitel.setKolicinaRamMemorije(2);//GB
		
		mojMobitel.setBrojMegapikselaKamere(13.3);//Mp
		
		mojMobitel.ispisiSpecifikaciju();
		
		mojMobitel.instalirajAplikaciju("Pinterest");
		mojMobitel.instalirajAplikaciju("Opera");
		mojMobitel.instalirajAplikaciju("UCBrowser");
		mojMobitel.instalirajAplikaciju("9gag");
		mojMobitel.instalirajAplikaciju("ES File Explorer");
		mojMobitel.instalirajAplikaciju("Viber");
		mojMobitel.instalirajAplikaciju("XiiaLive");
		mojMobitel.instalirajAplikaciju("MX Player Pro");
		mojMobitel.instalirajAplikaciju("Mobogenie");
		mojMobitel.instalirajAplikaciju("Simplenote");
		mojMobitel.instalirajAplikaciju("Opera Max");
		mojMobitel.instalirajAplikaciju("Geekbench");
		mojMobitel.instalirajAplikaciju("Pastebin");
		mojMobitel.instalirajAplikaciju("Lapse It Pro");
		mojMobitel.instalirajAplikaciju("PicSay Pro");
		mojMobitel.instalirajAplikaciju("Total Commander");
		mojMobitel.instalirajAplikaciju("Paragon_UMS");
		mojMobitel.instalirajAplikaciju("AIDE");
		mojMobitel.instalirajAplikaciju("Instagram");
		mojMobitel.instalirajAplikaciju("Kik");
		
		System.out.println();
		
//		mojMobitel.instalirajAplikaciju("Messenger");
//		mojMobitel.obrisiAplikaciju("Facebook");
//		mojMobitel.obrisiAplikaciju("Kik");
//		mojMobitel.instalirajAplikaciju("Messenger");
		mojMobitel.obrisiAplikaciju("AIDE");
		mojMobitel.instalirajAplikaciju("NoviAIDE");
		mojMobitel.obrisiAplikaciju("Lapse It Pro");
		mojMobitel.instalirajAplikaciju("Nova Kamera");
		
		System.out.println();
		
		mojMobitel.ispisiInstaliraneAplikacije();
		
	}

}
