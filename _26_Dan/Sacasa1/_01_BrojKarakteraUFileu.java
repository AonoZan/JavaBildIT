import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _01_BrojKarakteraUFileu {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
	
	
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Unesite ime fajla: ");
		String path = input.nextLine();
		File file = new File(path);
		
		if(!file.exists()){
			System.out.println("Fajl ne postoji.");
			System.exit(2);
		}
		Scanner fileInput = new Scanner(file);
		
		
		int brojKaraktera = 0, brojRijeci = 0, brojLinija = 0;
		
		while(fileInput.hasNextLine()){
			String[] line = fileInput.nextLine().split(" ");
			
			for (String rijec : line) {
				brojKaraktera += rijec.length();
				brojRijeci++;
			}
			
			if (line[0].length() > 0) brojLinija++;
		}
		
		System.out.printf("Broj karaktera: %d\nBroj rijeci: %d\nBroj linija: %d\n",
				brojKaraktera,
				brojRijeci,
				brojLinija);
		fileInput.close();
		closeScanner();
	}
}
