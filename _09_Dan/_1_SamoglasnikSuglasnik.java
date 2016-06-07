import java.util.Scanner;

public class _1_SamoglasnikSuglasnik {

		public static void main(String[] args) {
			// create scanner
			Scanner unos = new Scanner(System.in);
			
			//ask for character
			System.out.print("Unesite neko slovo: ");
			char character = unos.next().toUpperCase().charAt(0);
			System.out.println();
			unos.close();
			
			if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' ) {
				System.out.printf("Slovo %c je samoglasnik.", character);
			}else{
				System.out.printf("Slovo %c je suglasnik.", character);
			}
	}
}
