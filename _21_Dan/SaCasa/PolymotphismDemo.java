/**@autor AonoZan Dejan Petrovic 2016 ©
 */
class Animal {
	public void makeNoise() {
		System.out.println("Some noise");
	}
}
class Dog extends Animal {
	public void makeNoise() {
		System.out.println("Woof");
	}
}
class Cat extends Animal {
	public void makeNoise() {
		System.out.println("Meow");
	}
}
public class PolymotphismDemo {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.makeNoise();
		
		Animal dog = new Dog();
		dog.makeNoise();
		
		print(cat);
		print(dog);
	}
	public static void print(Animal a) {
		a.makeNoise();
	}

}
