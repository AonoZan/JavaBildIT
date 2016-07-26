/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _28_Dan;

public class TestGenericStack {
	public static java.util.Scanner userInput = new java.util.Scanner(System.in);

	public static void closeUserInput() {
		userInput.close();
	}

	public static void main(String[] args) {
		GenericStack<String> stack = new GenericStack<>();
		stack.push("London");
		stack.push("Paris");
		stack.push("Berlin");
		
		System.out.println(stack.toString());
		
		GenericStack<Integer> stack1 = new GenericStack<>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.println(stack1.toString());
		closeUserInput();
	}
}
