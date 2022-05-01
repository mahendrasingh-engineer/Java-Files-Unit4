package ans1;

public class AccountDemo {
	public static void main(String[] args) {
		Account account1=new Account(12);
		account1.deposit(122);
		try {
			account1.withdraw(10000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
