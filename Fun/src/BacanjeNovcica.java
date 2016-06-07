import java.awt.AWTException;
import java.awt.Robot;

public class BacanjeNovcica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Robot robbie = new Robot();
			robbie.keyPress(17);
			robbie.keyPress(76);
			
			robbie.keyRelease(17);
			robbie.keyRelease(76);
		}catch(AWTException ex){
			System.out.println("err");
		}
		
		
		
//		for (int i = 0; i < 1; i++) {
//			System.out.println("sadad");
//			System.out.print("\f");
//		}
		
		System.out.println("aaaaa");
		System.out.println("aasdasd156");
		
		System.out.print(String.format("\b\b\b", 1));
		System.out.print(String.format("sd", 1));
		
		
		
//		try {
//			Robot robbie = new Robot();
//			robbie.keyPress(17);
//			robbie.keyPress(76);
//			
//			robbie.keyRelease(17);
//			robbie.keyRelease(76);
//		}catch(AWTException ex){
//			System.out.println("err");
//		}
//		
	}

}
