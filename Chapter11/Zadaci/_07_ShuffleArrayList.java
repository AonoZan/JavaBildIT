import java.util.ArrayList;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _07_ShuffleArrayList {
	public static void shuffle(ArrayList<Integer> list){
		for (int index = 0; index < list.size(); index++) {
			int indexRandom = (int)(Math.random() * list.size());
//			System.out.printf("%d %d\n", list.get(index), indexRandom);
			list.set(index, list.get(index) + list.get(indexRandom));
			list.set(indexRandom, list.get(index) - list.get(indexRandom));
			list.set(index, list.get(index) - list.get(indexRandom));
			// 2 5
			// 7 5
			// 7 2
			// 5 2
		}
	}
	public static void printList(ArrayList<Integer> list){
		for (int i : list) {
			System.out.printf("%d, \n", i);
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			intList.add((int)(Math.random() * 50));
		}
		System.out.println(5-2);
		printList(intList);
		System.out.println();
		shuffle(intList);
		printList(intList);
	}

}
