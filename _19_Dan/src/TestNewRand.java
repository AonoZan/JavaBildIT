import java.util.Random;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestNewRand {

	public static void main(String[] args) {

		Random random1 = new Random(1);
        
        int[] comparison = {random1.nextInt(10), random1.nextInt(10), random1.nextInt(10)};
        int[] current = {0, 0, 0};
        int firstIndex = 0;
        
        for(int i =1; i <= 500000; i++){
        	int num = random1.nextInt(10);
        	current[0] = current[1];
        	current[1] = current[2];
        	current[2] = num;
        	
//        	System.out.printf("%2d ", num);
//        	if (i%25 == 0) System.out.println();
			if (current[0] == comparison[0] &&
					current[1] == comparison[1] &&
					current[2] == comparison[2]) {
				System.out.printf("Same : %d-%d , %d-%d, %d-%d, %d\n",
						current[0], comparison[0],
						current[1], comparison[1],
						current[2], comparison[2],
						(i - firstIndex));
				firstIndex = i;
			}
        }
	}

}
