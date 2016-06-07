public class TwoMethodsSameName {
	public static String returnNum(double num, double num2){
		return "first";
	}
	public static String returnNum(int num, double num2){
		return "second";
	}

	public static void main(String[] args) {
		System.out.println(returnNum(2.0, 2));
	}

}
