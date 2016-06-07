
public class Pitanja {
	public static int rightAnswers = 0;
	public static int wrongAnswers = 0;
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void randomQuestion(){
		int x = (int)(Math.random() * 10);
		int y = (int)(Math.random() * 10);
		int solution = x - y;
		System.out.printf("Koliko je %d - %d? ", x, y);
		do {
			int userSolution = input.nextInt();
			if (solution == userSolution) {
				rightAnswers++;
				break;
			}
			wrongAnswers++;
			System.out.print("Pokusajte ponovo... ");
		} while (true);
		
	}
	public static void generateQuestions(int howMany){
		for (int i = 0; i < howMany; i++) {
			randomQuestion();
		}
	}
	public static void printResults(){
		System.out.printf("Test je zavrsen.\nTacnih odgovora imate %d,\n"
				+ "a netacnih %d.", rightAnswers, wrongAnswers);
	}
	public static void main(String[] args) {
		System.out.printf("Unesite broj pitanja: ");
		int numOfQuestions = input.nextInt();
		System.out.println(0 - 1);
		generateQuestions(numOfQuestions);
		printResults();
	}

}
