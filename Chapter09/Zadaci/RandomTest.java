/**@autor AonoZan Dejan Petrovic 2016 ©
 */
import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		Random randomSeed = new Random(1000);
		
		for (int i = 0; i < 50; i++) {
			System.out.printf("%2d: %-3d\n", i, randomSeed.nextInt(100));
		}
	}

}
