import java.util.Scanner;


public class _4_PonavljanjeKaraktera {
	public static int count(String str, char a){
		int karakterPonavljanje = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				karakterPonavljanje++;
			}
		}
		return karakterPonavljanje;
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite recenicu i karakter na kraju: ");
		String recenica = "recenica e"; //unos.next();
		char karakter = recenica.charAt(recenica.length()-1);
		recenica = recenica. substring(0, recenica.length()-2);
		
		unos.close();
		
		System.out.printf("\nKarakter \"%c\" se ponavlja %d puta.", karakter, count(recenica, karakter));
		
	}

}
