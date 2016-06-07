/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestRaspored {

	public static void main(String[] args) {
		Raspored javaBildITKurs = new Raspored();
		
		javaBildITKurs.unesiCasove(2, 1);
		javaBildITKurs.unesiCasove(2, 2);
		javaBildITKurs.unesiCasove(2, 3);
		
		System.out.println("Raspored casova: ");
		javaBildITKurs.prikaziCasove();
	} 

}
