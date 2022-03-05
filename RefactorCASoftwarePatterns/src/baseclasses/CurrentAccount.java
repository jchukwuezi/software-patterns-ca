package baseclasses;
import java.util.ArrayList;

public class CurrentAccount extends CustomerAccount 
{
	ATMCard atm;
	
public CurrentAccount()
{
	super();
	this.atm = null;
	
}

public CurrentAccount(ATMCard atm, String number, double balance, ArrayList<AccountTransaction> transactionList)
{
	super(number, balance, transactionList);	
	this.atm = atm;
}

public ATMCard getAtm()
{
	return this.atm;
}

public void setAtm(ATMCard atm)
{
	this.atm = atm;
}

}