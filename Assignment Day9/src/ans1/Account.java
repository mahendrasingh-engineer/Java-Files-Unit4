package ans1;

public class Account {
	int accountNumber;
	double balance;
	
	
	
	
	
	
	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	
	
	
	
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public double withdraw(int amount) throws InsufficientFundsException{
		
		if(balance<amount) {
			throw new InsufficientFundsException();
		}else {
			balance-=amount;
		}
		
		
		
		
		return amount;
		
	}

}
