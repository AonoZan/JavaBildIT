/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Raspored {
	private String[] ponedjeljak;
	private String[] utorak;
	private String[] srijeda;
	private String[] cetvrtak;
	private String[] petak;
	private String[] subota;
	private String[] nedjelja;
	
	Raspored() {
		this.ponedjeljak = new String[7];
		this.utorak = new String[7];
		this.srijeda = new String[7];
		this.cetvrtak = new String[7];
		this.petak = new String[7];
		this.subota = new String[7];
		this.nedjelja = new String[7];
	}
	
	public void unesiCasove() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < 7; j++) {
				unesiCasove(i, j);
			}
			
		}
	}
	public void unesiCasove(int dan) {
		for (int i = 0; i < 7; i++) {
			unesiCasove(dan, i);
		}
	}
	public void unesiCasove(int dan, int cas) {
		switch (dan) {
		case 1:
			System.out.printf("Unesite %d cas za ponedjeljak: ", cas);
			this.ponedjeljak[cas] = Inputs.input.nextLine();
			break;
		case 2:
			System.out.printf("Unesite %d cas za utorak: ", cas);
			this.utorak[cas] = Inputs.input.nextLine();
			break;
		case 3:
			System.out.printf("Unesite %d cas za srjedu: ", cas);
			this.srijeda[cas] = Inputs.input.nextLine();
			break;
		case 4:
			System.out.printf("Unesite %d cas za cetvrtak: ", cas);
			this.cetvrtak[cas] = Inputs.input.nextLine();
			break;
		case 5:
			System.out.printf("Unesite %d cas za petak: ", cas);
			this.petak[cas] = Inputs.input.nextLine();
			break;
		case 6:
			System.out.printf("Unesite %d cas za subotu: ", cas);
			this.subota[cas] = Inputs.input.nextLine();
			break;
		case 7:
			System.out.printf("Unesite %d cas za nedjelju: ", cas);
			this.nedjelja[cas] = Inputs.input.nextLine();
			break;
		default:
			break;
		}
	}
	
	public void prikaziCasove() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < 7; j++) {
				prikaziCasove(i, j);
			}
		}
	}
	public void prikaziCasove(int dan) {
		for (int i = 0; i < 7; i++) {
			prikaziCasove(dan, i);
		}
	}
	public void prikaziCasove(int dan, int cas) {
		switch (dan) {
		case 1:
			System.out.printf("\tponedjeljak %2d cas: %s\n", cas, this.ponedjeljak[cas]);
			break;
		case 2:
			System.out.printf("\tutorak %2d cas: %s\n", cas, this.utorak[cas]);
			break;
		case 3:
			System.out.printf("\tsrijeda %2d cas: %s\n", cas, this.srijeda[cas]);
			break;
		case 4:
			System.out.printf("\tcetvrtak %2d cas: %s\n", cas, this.cetvrtak[cas]);
			break;
		case 5:
			System.out.printf("\tpetak %2d cas: %s\n", cas, this.petak[cas]);
			break;
		case 6:
			System.out.printf("\tsubota %2d cas: %s\n", cas, this.subota[cas]);
			break;
		case 7:
			System.out.printf("\tnedjelja %2d cas: %s\n", cas, this.nedjelja[cas]);
			break;
		default:
			break;
		}
	}
}
