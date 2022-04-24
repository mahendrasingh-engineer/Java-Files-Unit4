package ans3;

public class Bank {
	String branchName;
	String ifscCode; 
	
	
	public Bank(String branchName, String ifscCode) {
		super();
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}


	public Bank() {
		super();
	}


	public void displayDetails() {
		System.out.println("branchName :"+branchName+",  ifscCode :"+ifscCode);
	}
}
