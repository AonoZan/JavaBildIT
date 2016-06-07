
public class Samoglasnik {
	public static char[] samoglasnici = {'a', 'e', 'i', 'o', 'u'};
	public static void jeLiSamoglasnik(char character){
		for (int i = 0; i < samoglasnici.length; i++) {
			if (character == samoglasnici[i]) {
				System.out.printf("Karakter %c je samoglasnik.", character);
				return;
			}
		}
		System.out.printf("Karakter %c je suglasnik.", character);
	}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite neki jedno slovo: ");
		char character = input.next().charAt(0);
		input.close();
		jeLiSamoglasnik(character);
	}
}
