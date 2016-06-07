import java.util.Scanner;


public class _10_WebPass {
	public static boolean lengthValid(String pass){
		if (pass.length() < 8) {
			System.out.println("Duzina sifre je manja od 8 karaktera.");
			return false;
		}
		return true;
	}
	public static boolean lettersNumbersValid(String pass){
		boolean valid = false;
		for (int i = 0; i < pass.length(); i++) {
			char c = pass.charAt(i);
			if (c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c >= 'a' && c <= 'z' ) {
				valid = true;
			}else {
				System.out.printf("Sifra sadrzi ilegalan znak. '%c'\n", c);
				return false;
			}
		}
		return valid;
	}
	public static boolean haveTwoNumValid(String pass){
		int howManyNum = 0;
		for (int i = 0; i < pass.length(); i++) {
			char c = pass.charAt(i);
			if (c >= '0' && c <= '9') {
				howManyNum++;
			} 
		}
		if (howManyNum >= 2) {
			return true;
		}
		System.out.println("Sifra mora da sadrzi najmanje 2 broja.");
		return false;
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite svoju sifru: ");
		String sifra = "aasdFFWFsdsda5s956438";//unos.nextInt();
		System.out.println();
		unos.close();
		
		if (lengthValid(sifra) && lettersNumbersValid(sifra) && haveTwoNumValid(sifra)) {
			System.out.println("Vasa sifra je validna.");
		}else {
			System.out.println("Vasa sifra nije validna.");
		}
		
		
	}

}
