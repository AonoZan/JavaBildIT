import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _04_ReverseWords {
	public static void processLine(String line) {
		String[] stringArray = line.split(" ");
		StringBuilder output = new StringBuilder();
		for (int i = stringArray.length-1; i >= 0; i--) {
			output.append(stringArray[i] + " ");
		}
		System.out.println(output.substring(0, output.length()-1));
	}
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            processLine(line);
        }
        buffer.close();
    }
}
