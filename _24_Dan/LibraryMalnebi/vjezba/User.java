package vjezba;

public class User {

	private String name;
	private int maxBooks = 3;
	private static int idUser=0;
	private int userID;
	

	public User(String name) {
		this.name = name;
		idUser++;
		this.userID = idUser;
	}

	public String getName() {
		return this.name;
	}

	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}

	public int getMaxBooks() {
		return this.maxBooks;
	}

	public int getUserID() {
		return userID;
	}
	
	public static int getIdUser(){
		return idUser;
	}

	@Override
	public String toString() {
		return "User ID "+getUserID()+" NAME:"+getName()+" ("+this.getMaxBooks()+" max books)\n ";
	}

}