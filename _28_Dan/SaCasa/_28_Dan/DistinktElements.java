/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _28_Dan;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinktElements {
	public static <E> ArrayList<E> nonDuplicate(ArrayList<E> list){
//		Set<E> aSet = new HashSet<E>(list);
		return new ArrayList<E>(new HashSet<E>(list));
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(1);
		list.add(2);
		list = nonDuplicate(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
	}
}
