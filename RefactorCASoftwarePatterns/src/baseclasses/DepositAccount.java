package baseclasses;
import java.util.ArrayList;

public class DepositAccount extends CustomerAccount
{
   double interestRate;

public DepositAccount()
{
	super();
	this.interestRate = 0;
}

public DepositAccount(double interestRate, String number, double balance, ArrayList<Transaction> transactionList)
{
	super(number, balance, transactionList);	
	this.interestRate = interestRate;
}

public double getInterestRate()
{
	return this.interestRate;
}

public void setInterestRate(double interestRate)
{
	this.interestRate = interestRate;
}



}