/**@autor AonoZan Dejan Petrovic 2016 ©
 */
/*UML
 * 		BodyMassIndex
 * - name: String
 * - age: short
 * - height: double
 * - feet: double
 * - inches: double
 * 
 * BodyMassINdex(name: String, age: short
 * 				height: double, feet: double, inches: double)
 * 
 * + getBMI(): double
 */

public class _02_BodyMassIndex {
	private String name;
	private int age;
	private double weight;
	private double feet;
	private double inches;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	_02_BodyMassIndex(String name, int age, double weight, double feet, double inches) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}
	
	public double getBMI() {
//		double bmi = this.weight * KILOGRAMS_PER_POUND / ((this.feet+this.inches * METERS_PER_INCH) * (this.feet+this.inches * METERS_PER_INCH));
//		return bmi; //Math.round(bmi * 100) / 100.0;
		return Math.round(this.weight / ((this.feet + this.inches/100) * (this.feet + this.inches/100)));
	}
	public String getStatus() {
		if (getBMI() < 18.5) {
			return "Prethranjenost";
		} else if (getBMI() >= 18.5 && (getBMI() < 25.0)) {
			return "Normalan BMI";
		} else if ((getBMI() <= 25.0) && (getBMI() < 30.0)) {
			return "Gojaznost";
		} else {
			return "Pretilost";
		}
	}
	public String toString() {
		return "BMI:\n\tname: "
				+ this.name
				+ "\n\tage: "
				+ this.age
				+ "\n\tbmi: "
				+ getBMI()
				+ "\n\tstatus: "
				+ getStatus();
	}
}
