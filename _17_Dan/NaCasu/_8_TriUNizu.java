
public class _8_TriUNizu {
	public static void sort(int[] array){
		
	}
	public static boolean akoSuUNizu(int[] array){
		if (array[0] - array[1] == array[2] && array[1] - array[2] == array[0]) {
			return true;
		}else if (array[1] - array[0] == array[2] && array[2] - array[1] == array[0]){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Unesite tri broja: ");
		int[] array = new int[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = Inputs.input.nextInt();
		}
		System.out.println(akoSuUNizu(array));
	}

}
