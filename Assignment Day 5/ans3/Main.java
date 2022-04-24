package ans3;


import java.util.Scanner;




public class Main {
	public static void main(String[] args) {
		System.out.println("hello in java");
		AccountDetails ad1=new AccountDetails();
		Account a1= ad1.getAccountDetails();
		a1.withdraw(ad1.getWithdrawAmount());
		
	}
}








class AccountDetails{
	public  Account getAccountDetails() {
		int accountId=-1; String accountType=""; int balance=0;
		Scanner sc=new Scanner(System.in);
		while(accountId<=0) {
			try {
				
				System.out.println("please enter the account ID");
				accountId=sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("please enter a valid account Id");
			}
			if(accountId<=0) {
				System.out.println("please enter valid detais and valid formate");
			}
		}
		
		
		
		while(accountType=="") {
			try {
				System.out.println("please enter the account type");
				accountType=sc.nextLine();
			} catch (Exception e) {
				
				System.out.println("please enter a valid account type");
				
			}
			if(accountType=="") {
				System.out.println("please enter valid detais and valid formate");
			}
		}
		
		
		while(balance<=0) {
			try {
				System.out.println("please enter the balance");
				balance=sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("please enter a valid amount");
			}
			if(balance<=0) {
				System.out.println("please enter valid detais and valid formate");
			}
		}
		
		
		
		
		Account a1=new Account( accountId,  accountType,  balance) ;
		//sc.close();
		return a1;
	}
	
	
	
	public int getWithdrawAmount() {
		Scanner sc1=new Scanner(System.in);
		int amount=0;

		
		
		while(amount<=0) {
			try {
				System.out.println("enter the withdrawal amount :");
				amount=sc1.nextInt();
				System.out.println("amount :"+amount);
				sc1.nextLine();
			} catch (Exception e) {
				System.out.println("please enter a valid amount"+e);
				sc1.nextLine();
			}
		}
		sc1.close();
		return amount;
	}
	
	
	public static void main(String[] args) {
		
	}
}






class Account{
	private int accountId ;
	private String accountType ;
	private int balance ;
	
	
	
	
	
	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
	
	
	
	

	public Account(int accountId, String accountType, int balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}


	public Account() {
		super();
	}


	public boolean withdraw(int wAmount) {
		if(balance>wAmount) {
			balance-=wAmount;
			System.out.println("Balance amount after withdraw  :"+balance);
			return true;
		}
		System.out.println("Sorry!!! No enough balance");
		return false;
	}

}