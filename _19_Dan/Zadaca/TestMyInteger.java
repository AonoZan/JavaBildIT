/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger integer1 = new MyInteger(7);
		
		System.out.println(integer1.isEven());
		System.out.println(integer1.isOdd());
		System.out.println(integer1.isPrime());
		
		System.out.println();
		
		System.out.println(integer1.isEven(8));
		System.out.println(integer1.isOdd(8));
		System.out.println(integer1.isPrime(8));
		
		System.out.println();
		
		MyInteger integer2 = new MyInteger(8);
		System.out.println(integer1.equals(6));
		System.out.println(integer1.equals(integer2));
		
		System.out.println();
		
		char[] array = {'2', '8', '4'};
		System.out.println(integer1.parseInt(array));
		String string = "789";
		System.out.println(integer1.parseInt(string));
	}

}
