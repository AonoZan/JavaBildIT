package vjezba;

public class TESTMyLibrary {

	public static void main(String[] args) {
		// kreiramo objekat biblioteke
		MyLibrary lib = new MyLibrary();
		// kreiranje objekata klase Book
		Book book1 = new Book("War and Peace", "Tolstoj");
		Book book2 = new Book("Ana Karenina", "Tolstoj");
		Book book3 = new Book("Sidarta", "Hese");
		Book book4 = new Book("Stepski vuk", "Hese");
		
		// dodavanje objekata Book u listu u klasi MyLibrary
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		lib.addBook(book4);
		
		// kreiranje objekata klase User
		User user1 = new User("Dejan");
		User user2 = new User("Pavle");
		User user3 = new User("Ranka");
		// dodavanje objekata klase User u listu klase MyLibrary
		lib.addUser(user1);
		lib.addUser(user2);
		lib.addUser(user3);

		// ispis stanja prije izmjena
//		System.out.println("LIBRARY STATUS before CHECKING OUT BOOKS");
//		lib.printStatus();
//		System.out.println();
		// izdavanje knjiga 1. korisniku
		lib.checkOutBook(book1, user1);
		try {
		    Thread.sleep
		(10000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		lib.checkOutBook(book2, user1);
		try {
		    Thread.sleep
		(10000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		lib.checkOutBook(book3, user1);
		System.out.println();
		//pokušaj izdavanja knjige korisniku koji vec ima dozvoljen broj knjiga
		lib.checkOutBook(book4, user1);
		
		// pokušaj izdavanja veæ izdate knjige
		lib.checkOutBook(book1, user2);
		// ispis stanja poslije izmjena
		System.out.println("LIBRARY STATUS after CHECKING OUT BOOKS");
		lib.printStatus();

	}

}