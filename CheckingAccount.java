/**
   Reimplement the CheckingAccount class below so that the
   first withdrawal is free but each addiitional withdrawal during a month incurs $20 fee.

Add code below to make CheckingAccount a subclass of BankAccount
 */

public class CheckingAccount extends BankAccount
{
	/**
Add an instance variable below that keeps track of the number of withdrawals each month
	 */   

	private int withdrawNumb;

	/**
      Constructs a checking account with a zero balance. Set withdrawals to 0 as well
	 */
	public CheckingAccount()
	{
		super.getBalance();
		withdrawNumb = 0;
	}

	/**
      Add code below. If more than 1 withdrawal in month. Withdraw an extra 20 from BankAccount balance
	 */
	public void withdraw(double amount)
	{
		if (withdrawNumb < 1)
		{
			super.withdraw(amount);
			withdrawNumb++;
		}
		else
		{
			amount = amount + 20;
			super.withdraw(amount);
			withdrawNumb++;
		}
	}

	/**
      Add code to End of month procedure to reset number of withdrawals to 0 
	 */
	public void monthEnd()
	{
		withdrawNumb = 0;
	}
}

