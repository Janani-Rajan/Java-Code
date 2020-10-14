public class SalariedEmployee extends Employee {
	private double annualSalaryAmt;
	
	public SalariedEmployee() {
		annualSalaryAmt = 1000000;
	}

	public double getSalaryAmt() {
		return annualSalaryAmt;
	}

	public void setSalaryAmt(double d) {
		annualSalaryAmt = d;
	}
}
