/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _11_RemoveText {
	public static String filepath = new String();
	public static String string = new String();
	public static void processArguments(String[] args){
		if (args.length != 2) throw new InputMismatchException(
				"Not correct number of arguments: " + args.length + " (needs 2)\n");
	}
	public static void replaceInFile(File file, String string) throws IOException{
		Scanner fileInput = new Scanner(file);
		String content = new String(fileInput.useDelimiter("\\Z").next());
		content = content.replaceAll(string, "");
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(content);
		
		System.out.println(content);
		System.out.println(string);
		
		writer.close();
		fileInput.close();
	}
	public static void main(String[] args) {
		File file;
		
		try {
			processArguments(args);
			file = new File(args[1]);
			if(file.isDirectory()) throw new FileNotFoundException("File path is directory.\n(" + file.getPath() + ")");
			else if(!file.exists()) throw new FileNotFoundException("File does not exist.\n(" + file.getPath() + ")");
			else if(!file.canRead()) throw new FileNotFoundException("File is not readable.\n(" + file.getPath() + ")");
			replaceInFile(file, args[0]);
		} catch (FileNotFoundException e) {
			System.out.printf("Filepath is incorect:\n%s\n", e.getMessage());
		} catch (InputMismatchException e){
			System.out.printf("Incorrect input\n%s\n", e.getMessage());
		} catch (Exception e){
			System.out.printf("Unknown exception\n%s\n", e.getMessage());
		} finally {
			file = new File("");
		}
	}
}
