/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _XX01_DodatniDan;

import java.util.ArrayList;

public class Biblioteka {
	private ArrayList<Racun> listaRacuna;
	private ArrayList<Knjiga> listaKnjiga;
	private ArrayList<Posudjivanje> listaPosudjivanja;
	
	Biblioteka(){
		listaRacuna = new ArrayList<Racun>();
		listaKnjiga = new ArrayList<Knjiga>();
		listaPosudjivanja = new ArrayList<Posudjivanje>();
	}
	
	public ArrayList<Racun> getListaRacuna() {
		return listaRacuna;
	}

	public ArrayList<Knjiga> getListaKnjiga() {
		return listaKnjiga;
	}

	public ArrayList<Posudjivanje> getListaPosudjivanja() {
		return listaPosudjivanja;
	}

	public void posudiKnjigu(int brojRacuna, int brojKnjige){
		if(daLiRacunPostoji(brojRacuna) && daLiKnjigaPostoji(brojKnjige)){
			Knjiga knjiga = pronadjiKnjigu(brojKnjige);
			Racun racun = pronadjiRacun(brojRacuna);
			if (knjiga.isStatus() && racun.getBrojPosudjenihKnjiga() < 3){
				Posudjivanje posud = new Posudjivanje(brojRacuna, brojKnjige);
				listaPosudjivanja.add(posud);
				knjiga.setStatus(false);
				racun.povecajBrojKnjiga();
				
			}else {
				System.out.println("Knjiga je posudjena ili racun ima tri posudjene knjige.");
			}
		}
	}
	public void vratiKnjigu(int brojRacuna, int brojKnjige){
		if(daLiRacunPostoji(brojRacuna) && daLiKnjigaPostoji(brojKnjige)){
			Knjiga knjiga = pronadjiKnjigu(brojKnjige);
			Racun racun = pronadjiRacun(brojRacuna);
			Posudjivanje posud = pronadjiPosudjivanje(brojKnjige);
			if (posud == null){
				System.out.println("Ne postoji racun.");
			}else {
				knjiga.setStatus(true);
				racun.smanjiBrojKnjiga();
				listaPosudjivanja.remove(posud);
			}
			
		}
	}
	private Posudjivanje pronadjiPosudjivanje(int brojKnjige){
		for (Posudjivanje posud : listaPosudjivanja) {
			if (posud.getBrojKnjige() == brojKnjige) return posud;
		}
		return null;
	}
	private Knjiga pronadjiKnjigu(int brojKnjige){
		for (Knjiga knjiga : listaKnjiga) {
			if (knjiga.getBrojKnjige() == brojKnjige) return knjiga;
		}
		return null;
	}
	private Racun pronadjiRacun(int brojRacuna){
		for (Racun racun : listaRacuna) {
			if (racun.getBrojRacuna() == brojRacuna) return racun;
		}
		return null;
	}
	public void dodajKnjigu(int brojKnjige, String imeKnjige){
		if (brojKnjige > 0 && !daLiKnjigaPostoji(brojKnjige)) {
			Knjiga novaKnjiga = new Knjiga(brojKnjige, imeKnjige);
			listaKnjiga.add(novaKnjiga);
		}else {
			System.out.println("Broj nije validan.");
		}
	}
	public void dodajRacun(int brojRacuna, String imeRacuna){
		if (brojRacuna > 0 && !daLiRacunPostoji(brojRacuna)){
			Racun noviRacun = new Racun(brojRacuna, imeRacuna);
			listaRacuna.add(noviRacun);
			System.out.println("Racun je dodan.");
		}else {
			System.out.println("Racun vec postoji.");
		}
	}
	
	private boolean daLiKnjigaPostoji(int brojKnjige){
		if (!listaKnjiga.isEmpty()) {
			for (Knjiga knjiga : listaKnjiga) {
				if(knjiga.getBrojKnjige() == brojKnjige) return true;
			}
		}
		return false;
	}
	private boolean daLiRacunPostoji(int brojRacuna){
		if (!listaRacuna.isEmpty()) {
			for (Racun racun : listaRacuna) {
				if(racun.getBrojRacuna() == brojRacuna) return true;
			}
		}
		return false;
	}
	public void ispisiRacune(){
		for (Racun racun : listaRacuna) {
			System.out.println(racun);
		}
	}
	public void ispisiKnjiga(){
		for (Knjiga knjiga : listaKnjiga) {
			System.out.println(knjiga);
		}
	}
}
