import java.util.ArrayList;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Library {
	ArrayList<Book> books = new ArrayList<>();
	ArrayList<Account> accounts = new ArrayList<>();
	ArrayList<Log> logs = new ArrayList<>();
	
	Library() {
	}
	public boolean checkAccount(int id) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getId() == id) {
				System.out.println("Id vec postoji.");
				return true;
			}
		}
		return false;
	}
	public boolean checkBook(int id) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == id) {
				System.out.println("Id knjige vec postoji.");
				return true;
			}
		}
		return false;
	}
	
	public void createAccount(int id, String name){
		Account acc = new Account(id, name);
		accounts.add(acc);
	}
	public void createBook(int id, String name){
		Book acc = new Book(id, name);
		books.add(acc);
	}

	public void borrowBook(int idAccount, int idBook) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == idBook) {
				if(books.get(i).isStatus()) books.get(i).setStatus();
				else {
					System.out.println("Knjiga je zauzeta");
					return;
				}
			}
		}
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getId() == idAccount) {
				if (accounts.get(i).getNumber() < 3)
					accounts.get(i).numberUp();
				else {
					System.out.println("Imate maksimalan broj knjiga");
					return;
				}
			}
		}
		Log log = new Log(idBook, idAccount);
		logs.add(log);
	}
	public void returnBook(int idBook) {
		for (int i = 0; i < logs.size(); i++) {
			if (logs.get(i).getIdBook() == idBook) {
				for (int j = 0; j < books.size(); j++) {
					if(books.get(j).getId() == idBook) {
						books.get(j).setStatus();
						
					}
				}
				for (int j = 0; j < accounts.size(); j++) {
					if (accounts.get(j).getId() == logs.get(i).getIdAccount()) {
						accounts.get(j).numberDown();
						
					}
				}
				logs.remove(i); // ukloni log na kraju
				return;			// izadji jer je posao zavrsen
			}
		}
//		System.out.println("Knjiga je u biblioteci");// ako ne nadje log nece ni zavrsiti posao i
													// izici pa ce isprintati da je knjiga vec u biblioteci
	}
	public void showStatus() {
		System.out.println("Status:");
		System.out.println("\tNumber of books: "
				+ this.books.size()
				+ "\n\tNumber of accounts: "
				+ this.accounts.size());
		System.out.println("Logs:");
		for (int i = 0; i < logs.size(); i++) {
			System.out.printf( 
					  "\tAccount id: %d\n"
					+ "\tBook id: %d\n"
					+ "\tDate borrowed: %s\n"
					+ "----------------------------\n",
					logs.get(i).getIdAccount(),
					logs.get(i).getIdBook(),
					logs.get(i).getDate()
					);
		}
	}

}
