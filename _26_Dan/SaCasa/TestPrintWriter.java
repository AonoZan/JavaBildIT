import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestPrintWriter {

	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("SaCasa/ocjene.txt");
//		if(file.exists()) {
//			System.out.println("File vec postoji!");
//			System.exit(1);
//		}
		
//		java.io.PrintWriter output = new java.io.PrintWriter(file);
//		
//		output.print("Student 1 ");
//		output.println(90);
//		output.print("Student 2 ");
//		output.println(85);
//		
//		output.close();
		
		java.io.BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		
		writer.write("again\n");
		writer.close();

	}

}
