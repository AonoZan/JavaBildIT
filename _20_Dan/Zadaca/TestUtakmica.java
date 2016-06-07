/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestUtakmica {

	public static void main(String[] args) {
		Utakmica finale = new Utakmica();
		
		finale.setDomaciTim("Zeljeznicar");
		finale.setGostujuciTim("Siroki");
		
		finale.setCijenaKarata(16.5);
		finale.setBrojPosjetilaca(18246);
		
		finale.setRezultat("8:6");
		
		System.out.println(finale.izracunajZaraduOdProdajeKarata());
		
		finale.ispisStanjaUtakmice();
	}

}
