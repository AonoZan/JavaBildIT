import java.util.InputMismatchException;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class InputMIsmatch {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean nastaviUnos = true;
		
		do {
			try {
				System.out.println("Unesite cijeli broj: ");
				int broj = input.nextInt();
				
				System.out.printf("Broj koji ste unijeli je %d.\n", broj);
				
				nastaviUnos = false;
				
			} catch (InputMismatchException e) {
				System.out.print("Pokusjte ponovo. (netacan unos: unesite cijeli broj)\n");
				input.nextLine();
			}
		} while (nastaviUnos);

		input.close();
	}

}
