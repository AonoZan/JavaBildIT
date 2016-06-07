
public class _1_OstatakDijeljenja {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int ostatak = 0;
		while (x > y) {
			x -= y;
			ostatak = x;
		}
		System.out.println(ostatak);
	}

}
