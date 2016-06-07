
public class FutureDay {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String[] dani = {"ponedjeljak", "utorak", "srjeda", "cetvrtak", "petak", "subota", "nedjelja"};
		System.out.println("Unesite sadasnji broj danasnjeg dana i broj dana od tog dana: ");
		int sadasnjiDan = input.nextInt();
		int danUBuducnosti = input.nextInt();
		System.out.printf("Danasnji dan je %s, a dan u buducnosti je %s.", dani[sadasnjiDan-1], dani[((sadasnjiDan + danUBuducnosti)%7)-1]);
		input.close();
	}
}
