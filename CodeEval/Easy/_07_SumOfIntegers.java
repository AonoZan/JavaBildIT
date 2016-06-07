import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _07_SumOfIntegers {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
				sum += Integer.valueOf(line.substring(i, i+1));
			}
            System.out.println(sum);
        }
        buffer.close();
    }
}

