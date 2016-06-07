
public class RaggedArray {
	public static void main(String[] args){
		int[][] ragged = new int[3][];
		
		ragged[0] = new int[5];
		ragged[1] = new int[7];
		ragged[2] = new int[4];
		
		System.out.println(ragged[2][3]);
	}

}
