import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _10_NeparniBrojevi {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime fajla: ");
		java.io.File file = new java.io.File("Sacasa1/ScoreList.txt");
		Scanner fileInput = new Scanner(file);
		
		while(fileInput.hasNextLine()){
			String[] numbers = fileInput.nextLine().split(" ");
			for (String number : numbers) {
				if((Integer.valueOf(number) % 2) != 0) System.out.print(number + " ");
			}
		}
		fileInput.close();

	}

}
