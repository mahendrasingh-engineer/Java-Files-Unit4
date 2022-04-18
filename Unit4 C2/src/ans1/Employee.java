package ans1;

public abstract class Employee {
	protected Integer employeeId=0;
	protected String employeeName; 
	protected double salary;
	
	
	////////////////////////////////////////////////////////////////////////getter setter
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	////////////////////////////////////////////////////////////////////////constructors
	
	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	} 
	
	abstract public void calculateSalary();
}
