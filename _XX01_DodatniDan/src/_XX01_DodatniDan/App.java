/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _XX01_DodatniDan;

import java.util.Scanner;

public class App {
	private Biblioteka biblioteka;
	App(){
		this.biblioteka = new Biblioteka();
		
	}
	public void korisnickiMeni(){
		System.out.println("Izaberi jednu od ponudjenih opcija:");
		System.out.println("[1] Dodaj racun");
		System.out.println("[2] Dodaj knjigu");
		System.out.println("[3] Posudi knjigu");
		System.out.println("[4] Vrati knjigu");
		System.out.println("[5] Ispisi detalje");
		System.out.println("[6] Exit");
		Scanner unos = new Scanner(System.in);
		int izbor = unos.nextInt();
		
		switch (izbor) {
		case 1:{
			System.out.println("Upisi broj racuna: ");
			int brojRacuna = unos.nextInt();
			System.out.println("Upisi ime racuna: ");
			String imeRacuna = unos.next();
			this.biblioteka.dodajRacun(brojRacuna, imeRacuna);
			korisnickiMeni();}
		case 2:{
			System.out.println("Upisi broj knjige: ");
			int brojKnjige = unos.nextInt();
			System.out.println("Upisi ime knjige: ");
			String imeKnjige = unos.next();
			this.biblioteka.dodajKnjigu(brojKnjige, imeKnjige);
			korisnickiMeni();
			break;}
		case 3:{
			System.out.println("Unesi broj racuna: ");
			int brojRacuna = unos.nextInt();
			System.out.println("Upisi broj knjige: ");
			int brojKnjige = unos.nextInt();
			this.biblioteka.posudiKnjigu(brojRacuna, brojKnjige);
			korisnickiMeni();
			break;}
		case 4:{
			System.out.println("Unesi broj racuna: ");
			int brojRacuna = unos.nextInt();
			System.out.println("Upisi broj knjige: ");
			int brojKnjige = unos.nextInt();
			this.biblioteka.vratiKnjigu(brojRacuna, brojKnjige);
			korisnickiMeni();
			break;}
		case 5:{
			biblioteka.ispisiRacune();
			korisnickiMeni();}
		case 6:
			System.out.println("Hvala na posjeti.");
			System.exit(0);
		default:
			break;
		}
		unos.close();
	}
	
}
