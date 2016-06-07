public class InfiniteLoop {

	public static void main(String[] args) {
		int suma = 0;
		int i = 1;
		
		while (i < 10) {
			suma = suma + i;
			i++;
			
		}
		System.out.println(suma);
	}

}
