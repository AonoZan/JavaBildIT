import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class ReadData {

	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file = new java.io.File("src/ocjene.txt");
		
		Scanner input = new Scanner(file);
		
		while(input.hasNext()){
			String firstName = input.next();
			String lastName = input.next();
			
			int score = input.nextInt();
			
			System.out.printf("%s %s %d\n", firstName, lastName, score);
		}
		
		
		input.close();

	}

}
