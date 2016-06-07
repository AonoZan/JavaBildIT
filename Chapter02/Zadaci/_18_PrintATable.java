public class _18_PrintATable {

	public static void main(String[] args) {
		System.out.println("a     b     pow(a, b)");
		for (int i = 1; i < 6; i++) {
			System.out.printf("%-2d    %-2d    %.0f\n", i, i+1, Math.pow(i, i+1));
			
		}
		


	}

}
