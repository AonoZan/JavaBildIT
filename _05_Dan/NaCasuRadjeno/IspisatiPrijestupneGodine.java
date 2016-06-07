//public class IspisatiPrijestupneGodine {
//
//	public static void main(String[] args) {
//		for (int i = 100; i < 2101; i++) {
//			if (((i % 4) == 0) & ((i % 100) != 0) || ((i % 400) == 400)) {
//				System.out.printf("%4d god. je prijestupna.\n", i);
//				
//			}
//			
//		}
//
//	}
//
//}

public class IspisatiPrijestupneGodine {
	
	public static void main(String[] args) {
		int preskoci = 0;
		for (int i = 100; i < 2101; i++) {
			if (((i % 4) == 0) & ((i % 100) != 0) || ((i % 400) == 400)) {
				
				if ((preskoci % 10) == 0) {
					System.out.println();
				}
				System.out.printf("%4d, ", i);
				
				preskoci++;
				
				
			}
			
		}

	}

}
