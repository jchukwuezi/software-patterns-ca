package baseclasses;
import java.util.ArrayList; 

public class CustomerAccount  {
   
	String number;
	double balance;
	ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

	//Blank Constructor
	public CustomerAccount()
	{
		this.number = "";
		this.balance = 0;
		this.transactionList = null;
	}
	
	//Constructor with Details
	public CustomerAccount(String number, double balance, ArrayList<Transaction> transactionList)
	{
		this.number = number;
		this.balance = balance;
		this.transactionList = transactionList;
	}
	
	
	//Conceptually, setBalance method doesn't really make sense: 
	
	//instead I will have lodge and withdraw methods
	
	//withdraw method
	public void withdraw(double amount) {
		if(amount > getBalance()) {
			System.out.println("This withdrawal cannot be made due to insufficient funds");
		}
		
		balance = balance - amount;
	}
	
	//deposit method
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	//Accessor methods
	
	public String getNumber()
	{
		return this.number;
	}
	
	
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public ArrayList getTransactionList()
	{
		return this.transactionList;
	}

	//Mutator methods
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setTransactionList(ArrayList transactionList)
	{
		this.transactionList = transactionList;
	}
	
	
	
}
