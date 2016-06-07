/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	Loan(){
		this.loanDate = new java.util.Date();
	}
	Loan(double annualInterestRate, int numberOfYears, double loanAmount){
		this();
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	public double getMonthlyPayment(){
		return loanAmount * (annualInterestRate/1200) / (1 - 1 / Math.pow(1 + (annualInterestRate/1200), numberOfYears * 12));
	}
	public double getTotalPayment(){
		return getMonthlyPayment() * numberOfYears * 12;
	}
	
	
}
