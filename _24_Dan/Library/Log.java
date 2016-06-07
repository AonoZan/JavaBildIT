import java.util.Date;

/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Log {
	private int idBook;
	private int idAccount;
	private Date date;
	
	Log(){
		this.date = new Date();
	}
	Log(int idBook, int idAccount){
		this();
		this.idAccount = idAccount;
		this.idBook = idBook;
	}
	public int getIdBook() {
		return idBook;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public Date getDate() {
		return date;
	}

}
