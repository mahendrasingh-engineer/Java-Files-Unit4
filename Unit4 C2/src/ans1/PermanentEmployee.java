package ans1;

public class PermanentEmployee extends Employee{
	private double basicPay;
	

	
	
	public PermanentEmployee(Integer employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}


	public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		 double PFamount = basicPay * 0.12;
		salary = basicPay -PFamount; 
	}
	
	
	

}
