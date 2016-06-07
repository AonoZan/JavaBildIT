/**@autor AonoZan Dejan Petrovic 2016 ©.
 */

public class Knjizevnost {

	public static void main(String[] args) {
		Autor autor = new Autor("Ivo Andric", "ivo@minutesmail.com", 'M');
		Book book = new Book("Na drini..", autor, 19.99, 20000);
		
		System.out.println(book.toString());
		
	}

}
