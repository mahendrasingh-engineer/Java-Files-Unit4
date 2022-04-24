package ans3;

public class ICICIBank extends Bank{
	double rateOfInterest; 
	
	public ICICIBank(String branchName, String ifscCode, double rateOfInterest) {
		super(branchName, ifscCode);
		this.rateOfInterest = rateOfInterest;
	}
	
	

	@Override
	 public void displayDetails() {
		System.out.println("branchName :"+branchName+",  ifscCode :"+ifscCode+",  rate Of Interest :"+rateOfInterest);
	}
}
