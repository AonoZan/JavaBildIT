/**
 * @autor AonoZan Dejan Petrovic 2016
 */
public class _34_SortString {
	public static void main(String[] args){
		String string = "agbcaasddsfsfsdffd";
		char[] stringArray = string.toCharArray();
		Custom.sortArray(stringArray);
		System.out.println(String.valueOf(stringArray));
	}
}
