/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _27_Dan;

public class TestEdible {

	public static void main(String[] args) {
		Chicken chick = new Chicken();
		System.out.println(chick.howToEat());
		System.out.println(chick.sound());
	}
}
interface Edible {
	public abstract String howToEat();
}
abstract class Animal {
	public abstract String sound();
}
class Chicken extends Animal implements Edible{
	@Override
	public String howToEat(){
		return "ispeci koku";
	}
	@Override
	public String sound() {
		return "kvoc kvoc";
	}
}