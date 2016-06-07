public class StaticOrNot {
int count;
int x = factorial(5);
static int t = 67;
public static void main(String[] args) {
System.out.println();
}
public int getCount() {
	int x = factorial(5) + t;
	System.out.println(x);
	return count;

}
public static int factorial(int n) {
int result = 1;
for (int i = 1; i <= n; i++)
result *= i;
return result;
}
}