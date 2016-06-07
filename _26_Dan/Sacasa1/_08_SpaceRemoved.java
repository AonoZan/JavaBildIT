import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _08_SpaceRemoved {

	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime fajla: ");
		java.io.File file = new java.io.File("Sacasa1/Recenice.txt");
		Scanner fileInput = new Scanner(file);
		
		while(fileInput.hasNextLine()){
			String[] words = fileInput.nextLine().split(" ");
			String result = String.join("", words);
			System.out.println(result);
		}
		
		fileInput.close();
		
	}

}
