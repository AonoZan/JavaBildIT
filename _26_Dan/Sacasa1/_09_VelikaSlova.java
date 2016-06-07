import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _09_VelikaSlova {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime fajla: ");
		java.io.File file = new java.io.File("Sacasa1/WordList.txt");
		Scanner fileInput = new Scanner(file);
		
		while(fileInput.hasNextLine()){
			String[] words = fileInput.nextLine().split(" ");
			for (int i = 0; i < words.length; i++) {
				words[i] = (Character.toUpperCase(words[i].charAt(0))) + words[i].substring(1, words[i].length());
			}
			String result = String.join(" ", words);
			System.out.println(result);
		}
		fileInput.close();

	}

}
