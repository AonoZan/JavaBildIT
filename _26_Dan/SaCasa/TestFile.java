/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.io.IOException;

public class TestFile {
	public static void main(String[] rgss) throws IOException{
		java.io.File file = new java.io.File("src/test.txt");
		file.createNewFile();
		System.out.println("Da li fajl postoji? " + file.exists());
		System.out.println("Velicina fajla: " + file.length());
		System.out.println("Da li moze biti procitan? " + file.canRead());
		System.out.println("Da li moze biti pisan? " + file.canWrite());
		System.out.println("DA li je direktoriji? " + file.isDirectory());
		System.out.println("DA li je fajl? " + file.isFile());
		System.out.println("DA li je putanja absolutna? " + file.isAbsolute());
		System.out.println("DA li je sakriven? " + file.isHidden());
		System.out.println("Absolutni path: " + file.getAbsolutePath());
		System.out.println("File zadnji put modifikovan: " + new java.util.Date(file.lastModified()));
	}

}
