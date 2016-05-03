/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class MyInteger {
	private int value;
	
	MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if(this.value % 2 == 0) return true;
		return false;
	}
	boolean isOdd() {
		if (isEven()) return false;
		return true;
	}
	public boolean isPrime() {
		for (int i = 2; i <= this.value/2; i++) {
			if (this.value % i == 0) return false;
		}
		return true;
	}
	
	public boolean isEven(int value) {
		if(value % 2 == 0) return true;
		return false;
	}
	boolean isOdd(int value) {
		if (isEven(value)) return false;
		return true;
	}
	public boolean isPrime(int value) {
		for (int i = 2; i <= value/2; i++) {
			if (value % i == 0) return false;
		}
		return true;
	}
	
	public boolean equals(int value) {
		if (this.value == value) return true;
		return false;
	}
	public boolean equals(MyInteger value) {
		if (this.value == value.value) return true;
		return false;
	}
	
	public int parseInt(char[] array) {
		String number = "";
		for (int i = 0; i < array.length; i++) {
			number += array[i];
		}
		return parseInt(number);
	}
	public int parseInt(String number) {
		return Integer.valueOf(number);
	}
}
