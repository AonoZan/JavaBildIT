/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package GifGenerator;

public class GifTest {
	public static void printArray(int[][][][] array){
		StringBuffer string = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0][0].length; j++) {
				for (int j2 = 0; j2 < array[0][0][0].length; j2++) {
					for (int k = 0; k < array[0].length; k++) {
						string.append(array[i][j2][j][k]);
					}
//					string.append(" ");
				}
				string.append("\n");
			}
//			string.append("\n");
		}
		System.out.println(string.toString());
	}
	
	public static void printArray(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0) {
					System.out.print("[]");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void intToBits(int num, int[][] bits){
		int multiplier = 2;
		for (int i = bits.length-1; i >= 0; i--) {
			for (int j = bits[i].length-1; j >= 0; j--) {
				bits[i][j] = num % multiplier / (multiplier/2);
				multiplier *= 2;
			}
		}
	}
	public static int bitsToInt(int[][] bits){
		int num = 0;
		for (int i = bits.length-1; i >= 0; i--) {
			for (int j = bits[i].length-1; j >= 0; j--) {
				if (bits[i][j] == 1) num += (bits.length * bits[0].length)* (i+j+2);
			}
		}
		return num-1;
	}
	
	
	
	public static void main(String[] args) {
		int[][] bits1 = new int[2][4];
		int[][] bits2 = new int[2][4];
		
		char ch = (char)(175);
		
		intToBits((int)(ch), bits1);
		intToBits(255, bits2);
		
		String str = Integer.toBinaryString((int)(ch));
		int num = Integer.parseInt(str, 2);
		
		System.out.println(str);
		System.out.println(num);
		
		
//		int num = bitsToInt(bits1);
//		System.out.println((int)(ch) + " " + ch);
//		System.out.println(num);
//		printArray(bits);
		int[][][][] bitsArray = new int[2][4][][];
		
		bitsArray[0][0] = bits1;
		bitsArray[0][1] = bits1;
		bitsArray[0][2] = bits2;
		bitsArray[0][3] = bits1;
		
		bitsArray[1][0] = bits2;
		bitsArray[1][1] = bits1;
		bitsArray[1][2] = bits2;
		bitsArray[1][3] = bits2;
		
		printArray(bitsArray);
//		System.out.println(num);
		
	}
}




//System.out.println(Integer.toBinaryString(n));
//System.out.println(Integer.parseInt("11111111", 2));
//
//for (int i = 0; i < 256; i++) {
//	System.out.printf("%-3d.  %c    ", i, (char)(i));
//	if((i%16) == 0) System.out.println();
//}