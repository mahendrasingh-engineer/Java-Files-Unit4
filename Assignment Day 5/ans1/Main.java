package ans1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
		 
		 System.out.println("Enter Id:");
	     int employeedId = id.nextInt();
	 
		 System.out.println("Enter Name:");	
		 String employeeName = id.next();
		 
		 System.out.println("Enter Salary:");
		 double salary = id.nextDouble();
		 
		 System.out.println("Enter PF");
		 int pfPercentage = id.nextInt();
	  
		 	
		 Employee E1 = new Employee();
	 
		 E1.setEmployeeId(employeedId);
		 E1.setEmployeeName(employeeName);
		 E1.setSalary(salary);
	 
//		 int pf = Employee.getPFPercentage(pfPercentage);
		 E1.calculateNetSalary(pfPercentage);
		 
        System.out.println("------------------------------------");
		 
		 System.out.println("===Employee 1 Details==========");
		 System.out.println("------------------------------------");
		 
		 System.out.println("Id :"+E1.getEmployeeId());
		 System.out.println("Name :"+E1.getEmployeeName());
		 System.out.println("Salary :"+E1.getSalary());
		 System.out.println("netSalary :"+E1.getNetSalary());
		 System.out.println("Net pf Percentage is:"+Employee.getPFPercentage(E1));
	
		 Employee e2 = Employee.getEmployeeDetails(1231,"Mahendra Singh",70000);
		 e2.calculateNetSalary(7);
		 
		 System.out.println("------------------------------------");
		 
		 System.out.println("===Employee 2 Details==========");
		 System.out.println("------------------------------------");
		
		 System.out.println("Id :"+e2.getEmployeeId());
		 System.out.println("Name :"+e2.getEmployeeName());
		 System.out.println("Salary :"+e2.getSalary());
		 System.out.println("netSalary :"+e2.getNetSalary());
		 
		 System.out.println("Net pf Percentage is:"+Employee.getPFPercentage(e2));
	 
    id.close();  
	}
}

class Employee{
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
///////////////////////////////////////////////////////////////////constructors
	public Employee() {
		super();
	}
	
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		double finalSalary = getSalary()-((getSalary())*pfpercentage)/100; 
		  
		netSalary = finalSalary;
	}
///////////////////////////////////////////////////////////////////getter and setter methods
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
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
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
//////////////////////////////////////////////////////////////static functions
	
	
	public static int getPFPercentage(Employee e) 
	{
		
		return (int)(Math.round((1-(e.netSalary/e.salary))*100));
	}
	public static Employee getEmployeeDetails(int employeedId, String employeeName, double salary)
	{
		 Employee em = new Employee(employeedId,employeeName,salary);
		 return em;
	}
}