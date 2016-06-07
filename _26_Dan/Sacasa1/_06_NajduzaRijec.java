import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _06_NajduzaRijec {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime fajla: ");
		java.io.File file = new java.io.File("Sacasa1/WordList.txt");
		Scanner fileInput = new Scanner(file);
		
		while(fileInput.hasNextLine()){
			String[] words = fileInput.nextLine().split(" ");
			String longestWord = "";
			for (String word : words) {
				if(word.length() > longestWord.length()) longestWord = word;
			}
			System.out.println(longestWord);
		}
		fileInput.close();
	}
}
