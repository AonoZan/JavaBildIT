package vjezba;

import java.util.Date;

public class Book {

	private String title;
	private String author;
	private static int idBook = 0;
	private int bookID;
	User user;
	Date date;

	public Book() {
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		idBook++;
		this.bookID = idBook;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getBookID() {
		return bookID;
	}

	public static int getIdBook() {
		return idBook;
	}
	
	public String getDate(){
		return this.date.toString();
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}

	@Override
	public String toString() {
		String status;
		if (this.getUser() == null) {
			status = "Avaliable";
		} else
			status = "Unavaliable";
		return "Book ID: " + getBookID() + "; Book title: \"" + getTitle()
				+ "\"; Author: " + getAuthor() + "; Status: " + status+"\n";
	}

}