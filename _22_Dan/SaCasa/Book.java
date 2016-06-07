/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Book extends Autor{
	private String name;
	private Autor autor;
	private double price;
	private int qtyInStock;
	
	Book() {
		this.autor = new Autor();
	}
	Book(String name, Autor autor, double price, int qtyInStock) {
		this.name = name;
		this.autor = autor;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Autor getAutor() {
		return autor;
	}
	public String toString() {
		
		return this.autor.toString()
				+ "\nBook:"
				+ "\n\tname: "
				+ this.name
				+ "\n\tprice: "
				+ this.price
				+ "\n\tquantity: "
				+ this.qtyInStock;
	}

}
