import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _01_ScoreTotalAndAverage {
	private static Scanner input;
	public static void handleFile(String path) throws FileNotFoundException{
		File file = new File(path);
		if(!file.exists()) throw new FileNotFoundException("Ne postoji taj fajl.");
		
		int sum = 0, average = 0, number;
		input = new Scanner(file);
		
		while(input.hasNext()){
			if(!input.hasNextInt()) throw new NumberFormatException("Input is not an number");
			number = input.nextInt();
			sum += number;
			average++;
		}
		
		input.close();
		System.out.printf("Sum of scores is %d and average is %d.", sum, sum/average);
	}
	public static void main(String[] args){
		
		
		System.out.print("Enter path of rhe file: ");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.next();//"Zadaca/scores.txt";
		try {
			handleFile(path);
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
}
//class FileNotFoundException extends Exception{
//	private static final long serialVersionUID = 1L;
//
//	FileNotFoundException(String message){
//		super(message);
//	}
//}
