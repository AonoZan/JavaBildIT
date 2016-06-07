import java.util.Scanner;

public class _3_DuzinaStringa {
	public static int countLetter(String s){
		int duzinaStringa = 0;
		for (int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			//System.out.println(  s.charAt(i) );
			
			if (character >= 'A' && character <= 'z') {
				//System.out.print(character);
				duzinaStringa++;
			}
		}
		return duzinaStringa;
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neku recenicu: ");
		String recenica = "jsdgfsASFADFhdf 546";//unos.next();
		unos.close();
		System.out.println("Karaktera u stringu ima: " + countLetter(recenica));
		
		
		
	}

}
