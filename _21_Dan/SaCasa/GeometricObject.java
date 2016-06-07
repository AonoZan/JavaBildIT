/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class GeometricObject {
	private String color = "white";
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color) {
		this();
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "\tcolor: " +
				this.getColor() +
				"\n\tdate: " +
				getDateCreated();
	}
}
