public class Ck {
	private boolean x;

	public static void main(String[] args) {
		Ck c = new Ck();
		System.out.println(c.x);
		System.out.println(c.convert());
	}

	private int convert() {
		return x ? 1 : -1;
	}
}