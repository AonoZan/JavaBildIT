/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Test {
	
	public static void main(String[] args) {
		Library library = new Library();
		
		String[] knjige = {
				"Knjiga1",
				"Knjiga2",
				"Knjiga3",
				"Knjiga4",
				"Knjiga5",
				"Knjiga6",
				"Knjiga7",
				"knjiga8",
				"knjiga9",
				"Knjiga10"};
		String[] korisnici = {
				"Korisnik1",
				"Korisnik2",
				"Korisnik3",
				"Korisnik4",
				"Korisnik5"};
		
		for (int i = 0; i < knjige.length; i++) {
			library.createBook(i, knjige[i]);
		}
		for (int i = 0; i < korisnici.length; i++) {
			library.createAccount(i, korisnici[i]);
		}
		
		int idAccount = 2;
		String nameAccount = "Korisnik5";
		
		if(!library.checkAccount(idAccount))// ovaj id vec postoji
			library.createAccount(idAccount, nameAccount);// nece dodati ga
		
		int idBook1 = 10;
		int idBook2 = 8;
		int idBook3 = 4;
		int idBook4 = 2;
		
		library.borrowBook(idAccount, idBook1);
		library.borrowBook(idAccount, idBook2);
		library.borrowBook(idAccount, idBook3);
		library.borrowBook(idAccount, idBook4);// ne moze korisnik uzeti cetiri knjige
		
		library.returnBook(idBook1);
		library.returnBook(idBook1);			// vec je vratio ovu knjigu
		
		library.showStatus();
		
	}
}
