import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _05_MultipleBiggerOrEqual {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] stringArray = line.split(",");
            int x = 0;
            while (x < Integer.valueOf(stringArray[0])) {
				x += Integer.valueOf(stringArray[1]);
			}
            System.out.println(x);
        }
        buffer.close();
    }
}
