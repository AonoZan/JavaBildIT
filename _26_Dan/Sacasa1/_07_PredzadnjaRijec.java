import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _07_PredzadnjaRijec {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime fajla: ");
		java.io.File file = new java.io.File("Sacasa1/WordList.txt");
		Scanner fileInput = new Scanner(file);
		
		while(fileInput.hasNextLine()){
			String line = fileInput.nextLine();
			line = line.substring(0, line.lastIndexOf(" "));
			line = line.substring(line.lastIndexOf(" ")+1, line.length());
			System.out.println(line);
		}
		fileInput.close();

	}

}
