package baseclasses;
import java.util.ArrayList;

public class CurrentAccount extends CustomerAccount 
{
	ATMCard card;
	
public CurrentAccount()
{
	super();
	this.card = null;
	
}

public CurrentAccount(ATMCard atm, String number, double balance, ArrayList<Transaction> transactionList)
{
	super(number, balance, transactionList);	
	this.card = atm;
}

public ATMCard getAtm()
{
	return this.card;
}

public void setAtm(ATMCard atm)
{
	this.card = atm;
}

}