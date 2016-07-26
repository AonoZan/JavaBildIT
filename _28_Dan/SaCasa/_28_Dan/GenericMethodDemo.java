/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _28_Dan;

public class GenericMethodDemo {
	public static <E> void print(E[] list){
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] integers = {1, 2, 3, 4, 5};
		String[] strings = {"Doboj", "Stanari", "Tesanj"};
		
		GenericMethodDemo.<Integer> print(integers);
		GenericMethodDemo.<String> print(strings);
	}
}
