import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _03_StringUFajlNaopako {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void closeScanner(){input.close();}
	
	public static void main(String[] args) throws IOException {
		
		// 65 90  97 122
		java.io.File file = new java.io.File("Sacasa1/StringFajl.txt");
//		Scanner fileInput = new Scanner(file);
		
		java.io.BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		
		System.out.println("Unesite string: ");
		String string = input.next();
		writer.write(string+" ");
		
		writer.close();
		
		
		Scanner fileInput = new Scanner(file);
		ArrayList<String> list = new ArrayList<>();
		
		while(fileInput.hasNextLine()){
			String[] line = fileInput.nextLine().split(" ");
			
			for (String rijec : line) {
				list.add(rijec);
			}
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.printf("%s ", list.get(i));
		}
		fileInput.close();
		
	}

}
