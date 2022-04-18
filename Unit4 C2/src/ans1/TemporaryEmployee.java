package ans1;

public class TemporaryEmployee extends Employee {
	
	public TemporaryEmployee(Integer employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	
	private Integer hoursWorked=100;
	private Integer hourlyWages=308 ;
	
	
	public Integer getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(Integer hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public Integer getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(Integer hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		salary = hoursWorked * hourlyWages;

	}
	
}

class Loan{
	
	private Loan() {
		
	}
	public static Loan makeObj() {
		return new Loan();
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			return employeeObj.salary*15/100;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			return employeeObj.salary*10/100;
		}
		
		return 0;///////////////////////////////////////////////////
	}

}
