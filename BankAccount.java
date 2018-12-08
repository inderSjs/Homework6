import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	
	private int balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	
	
	
	public void withdraw( int amount)
	{
		
			System.out.println("withdrawing: " + amount);
			int newBalance = this.balance - amount;
			this.balance = newBalance;
			System.out.println("new balance is: "+ newBalance);
		
		
		
		
	
		
	}
	
	public void deposit( int amount)
	{
		
			System.out.println("Depositing: " + amount);
			int newBalance = this.balance + amount;
			this.balance = newBalance;
			System.out.println("new balance: "+ newBalance);
		
		
	}
	
	public void getBalance()
	{
		System.out.println("Balance is: " + this.balance);
	}

}
