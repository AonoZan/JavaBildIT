import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _05_ReadMore {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime fajla: ");
		java.io.File file = new java.io.File("Sacasa1/Tekst.txt");
		Scanner fileInput = new Scanner(file);
//		StringBuffer line = new StringBuffer(fileInput.useDelimiter("\\Z").next());
		
		
		while(fileInput.hasNextLine()){
			String line = fileInput.nextLine();
			if(line.length() > 55){
				line = line.substring(0, 40).concat("...<Read more>");
			}
			System.out.println(line);
		}
		
		fileInput.close();

	}

}
