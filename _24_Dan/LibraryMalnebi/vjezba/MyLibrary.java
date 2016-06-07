package vjezba;

import java.util.ArrayList;
import java.util.Date;

public class MyLibrary {

	ArrayList<Book> books = new ArrayList<>();
	ArrayList<User> users = new ArrayList<>();
	Date date = new Date();

	public MyLibrary() {
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addUser(User user) {
		this.users.add(user);
	}

	public void removeBook(Book book) {
		this.books.remove(book);
	}

	public void removeUser(User user) {
		this.users.remove(user);
	}

	/** izdavanje knjige korisniku */
	public void checkOutBook(Book book, User user) {
		int numberUsersBooks = this.getBooksWithUser(user).size();
		if (book.getUser() == null){ 
				if(numberUsersBooks < user.getMaxBooks()) {
			this.date = new Date();
			book.setUser(user);
			System.out.println("The book \"" + book.getTitle()
					+ "\" is now checked out to " + book.getUser().getName()+". \n Date checking out:" +date);
				}
				else{System.out.println(user.getName()+" allready has "+user.getMaxBooks()+" books and it is not aloved to borrow more!" );}
		} else
			System.out.println("The book \"" + book.getTitle()
					+ "\" is allready checked out to "
					+ book.getUser().getName()+", so it can't be lend to "+user.getName());
	}

	/** vracanje knjige u biblioteku */
	public void checkInBook(Book book) {
		if (book.getUser() != null)
			book.setUser(null);
		else
			System.out.println("The book \"" + book.getTitle()
					+ "\" is allready checkd in!");
		// knjiga je vracena
	}

	/** lista knjiga kod jednog korisnika */
	public ArrayList<Book> getBooksWithUser(User user) {
		ArrayList<Book> usersBooks = new ArrayList<>();

		for (Book someBook : this.getBooks()) {
			if ((someBook.getUser() != null)
					&& (someBook.getUser().getUserID() == (user.getUserID()))) {
				usersBooks.add(someBook);
			}
		}
		return usersBooks;
	}

	/** lista Dostupnih knjiga */
	public ArrayList<Book> getAvaliableBooks() {
		ArrayList<Book> avaliableBooks = new ArrayList<>();
		for (Book book : this.getBooks()) {
			if (book.getUser() == null)
				avaliableBooks.add(book);
		}
		return avaliableBooks;
	}

	/** lista NEdostupnih knjiga */
	public ArrayList<Book> getUnavaliableBooks() {
		ArrayList<Book> unAvaliableBooks = new ArrayList<>();
		for (Book book : this.getBooks()) {
			if (book.getUser() != null)
				unAvaliableBooks.add(book);
		}
		return unAvaliableBooks;
	}

	@Override
	public String toString() {
		return "BOOKS: " + Book.getIdBook() + "\n " + books + "\n USERS: "
				+ User.getIdUser() + " \n" + users + "\n";
	}

	public void printStatus() {
		System.out
				.println("------------------LIBRARY STATUS REPORT-------------");
		System.out.println(this.toString());

		System.out.println("Number of avaliable books: "
				+ this.getAvaliableBooks().size());
		for (Book book : this.getAvaliableBooks()) {
			System.out.println(book.toString());
		}

		System.out.println("Number of unavaliable books: "
				+ this.getUnavaliableBooks().size());
		for (Book book : this.getUnavaliableBooks()) {
			System.out.println(book.toString() + " checked out to " + book.getUser().getName()
					+ " on " + date);
		}

	}
}