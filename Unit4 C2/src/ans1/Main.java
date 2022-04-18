package ans1;

public class Main {
	public static void main(String[] args) {
		PermanentEmployee pe=new PermanentEmployee(223, "geeta", 40000);
		TemporaryEmployee te=new TemporaryEmployee(232, "shantanu");
		Loan l=Loan.makeObj();
		pe.calculateSalary();
		te.calculateSalary();
		System.out.println(l.calculateLoanAmount(te));
		System.out.println(l.calculateLoanAmount(pe));
		System.out.println(l.calculateLoanAmount(null));
	}
}
