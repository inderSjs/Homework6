
public class withdraw implements Runnable 
{
	private BankAccount ac;
	private int amount;
	
	public withdraw( BankAccount ac , int amount)
	{
		this.ac = ac;
		this.amount = amount;
	}
	
	public void run()
	{
		try
		{
			for( int i = 1; i <= 20 ; i++)
			{
				ac.withdraw(amount);
				Thread.sleep(0);
			}
		}
		catch( InterruptedException exception)
		{
			
		}
	}

}
