
public class QuadraticEquation {
	private int a;
	private int b;
	private int c;
	
	QuadraticEquation (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return Math.pow(this.b, 2) - (4 * a * c);
	}
	
	public double getRoot1() {
		if (getDiscriminant() < 0) return 0;
		return (-(b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (a + a);
	}
	public double getRoot2() {
		if (getDiscriminant() < 0) return 0;
		return (-(b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (a + a);
	}
}
