/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class test {
	public static void incorrectTest() {
//		boolean x;
//		System.out.println(x = true);  // dodjeljeno ali nije... nista uradjeno sa var(???)
	}
	public static void workaround() {
		boolean x = false;
		System.out.println(x = true);
		System.out.println(x);         // ovdje je nesto uradjeno sa njom
	}
	public static void corectTest() {
//		int x = 0;
//		System.out.println(x = 1 + 2); // isti slucaj 
//		System.out.println(x = 2 + 4); // nikad nije nista uradjeno sa varijablom
	}
	public static void main(String[] args) {
		incorrectTest();
		System.out.println();
		workaround();
		System.out.println();
		corectTest();
	}
}


	
