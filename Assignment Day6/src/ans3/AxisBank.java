package ans3;

public class AxisBank extends Bank{
	double rateOfInterest;
	
	
	public AxisBank(String branchName, String ifscCode, double rateOfInterest) {
		super(branchName, ifscCode);
		this.rateOfInterest = rateOfInterest;
	}

	public AxisBank() {
		super();
	}
	
	@Override
	 public void displayDetails() {
		System.out.println("branchName :"+branchName+",  ifscCode :"+ifscCode+",  rate Of Interest :"+rateOfInterest);
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
