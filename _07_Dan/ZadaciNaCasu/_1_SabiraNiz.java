public class _1_SabiraNiz {

	public static void main(String[] args) {
		double zbir = 0;
		
		for (int i = 1; i < 100; i= i+2) {
			zbir = zbir + (i / (i + 2.0 ));
			//System.out.println(i + "   " + "asd");
		}
		System.out.println("Zbir = " + zbir);
	}

}
