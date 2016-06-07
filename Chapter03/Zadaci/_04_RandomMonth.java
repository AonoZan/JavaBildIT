/**
 * @autor AonoZan Dejan Petrovic 2016 ©
 */

public class _04_RandomMonth {

	public static void main(String[] args) {
		int randMonh = (int) ((Math.random() * 12) + 1);
		
		switch (randMonh) {
		case 1:
			System.out.println("Januar");
			break;
		case 2:
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Maj");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Avgust");
			break;
		case 9:
			System.out.println("Septembar");
			break;
		case 10:
			System.out.println("Oktobar");
			break;
		case 11:
			System.out.println("Novembar");
			break;
		case 12:
			System.out.println("Decembar");
			break;
		default:
			System.out.println("Greska");
			break;
		}
	}

}
