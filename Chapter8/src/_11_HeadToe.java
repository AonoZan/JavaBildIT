public class _11_HeadToe {
	public static void printArray(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == 0) {
					System.out.print("H ");
				}else {
					System.out.print("T ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter number between 0 and 511: ");
		int n = input.nextInt();
		input.close();
		int[][] bits = new int[3][3];
		int multiplier = 2;
		for (int i = bits.length-1; i >= 0; i--) {
			for (int j = bits[i].length-1; j >= 0; j--) {
				bits[i][j] =n % multiplier / (multiplier/2);
				multiplier = multiplier * 2;
			}
		}
		
		printArray(bits);
//		int[] bits = {0, 0, 0};			// Testiranje formule
//		for (int i = 0; i < 16; i++) {
//			bits[0] = i%2;
//			bits[1] = i%4/2;
//			bits[2] = i%8/4;
//			
//			System.out.print(bits[2]);
//			System.out.print(bits[1]);
//			System.out.println(bits[0]);
//		}
		
		// 000
		// 001
		// 010
		// 011
		// 100
		// 101
		// 110
		// 111
		
		// 0000
		// 0001
		// 0010
		// 0011
		// 0100
		// 0101
		// 0110
		// 0111
		// 1000
		// 1001
		// 1010
		// 1011
		// 1100
		// 1101
		// 1110
		// 1111
	}

}
