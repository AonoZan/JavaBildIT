/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _28_Dan;
import java.util.ArrayList;

public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<>();
	
	public int getSize() {
		return list.size();
	}
	public void push(E o){
		list.add(o);
	}
	@Override
	public String toString(){
		return "stack: " + list.toString();
	}
}
