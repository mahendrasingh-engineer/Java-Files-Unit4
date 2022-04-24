package ans1;

public class Main {
	
	
	public static void main(String[] args) {
		DayScholar ds1=new DayScholar(345,"gopi",444,2344);
		Hosteller ds=new Hosteller(346,"gopi",444,2344);
		
		int fee=2388;
		System.out.println("your remaining fee is   Rs"+ds1.payFee(fee));
	}
	
}


class Student{
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		
	}
	
	double payFee(double fee) {
		examFee-=fee;
		
		return examFee;
	}

	public Student() {
		super();
	}

	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	
	
//	Instance Variables:
//		studId : integer,
//		studName :String,
//		examFee:double
//		Methods:
//		displayDetails(): void,
//		payFee() :double
//		Provide suitable constructors
}


class DayScholar extends Student{
	double transportFee;

	public DayScholar(int studId, String studName, double examFee, double transportFee) {
		super(studId, studName, examFee);
		this.transportFee = transportFee;
	}

	public DayScholar(double transportFee) {
		super();
		this.transportFee = transportFee;
	}

	public DayScholar() {
		super();
	}

	@Override
	double payFee(double fee) {
		if(transportFee<fee) {
			fee-=transportFee;
			transportFee=0;
			return super.payFee(fee);
		}
		transportFee-=fee;
		return transportFee+examFee;
	}
}


class Hosteller extends Student{
	double hostelFee;

	
	
	
	public Hosteller(double hostelFee) {
		super();
		this.hostelFee = hostelFee;
	}

	


	public Hosteller(int studId, String studName, double examFee, double hostelFee) {
		super(studId, studName, examFee);
		this.hostelFee = hostelFee;
	}
	
	@Override
	double payFee(double fee) {
		if(hostelFee<fee) {
			fee-=hostelFee;
			hostelFee=0;
			return super.payFee(fee);
		}
		hostelFee-=fee;
		return hostelFee+examFee;
	}
}



















