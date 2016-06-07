import java.util.Scanner;

public class _1_DjeljiviSaTrinaest {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite cijeli broj koji predstavlja gornu granicu: ");
		int gornjaGranica = unos.nextInt();
		unos.close();
		for (int i = 1; i <= gornjaGranica; i++) {
			if (i % 13 == 0) {
				System.out.print(i + " ");
			}
			
		}
	}

}
