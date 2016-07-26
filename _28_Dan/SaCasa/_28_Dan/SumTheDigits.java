/**@autor AonoZan Dejan Petrovic 2016 ©
 */
package _28_Dan;

public class SumTheDigits {
	public static int sumDigi(int num){
		System.out.println(num);
		if (num == 0) {
			return 0;
		}else
			return sumDigi(num/10);
	}
	public static void main(String[] args) {
		int num = 234;
		System.out.println(sumDigi(num));
	}
}
