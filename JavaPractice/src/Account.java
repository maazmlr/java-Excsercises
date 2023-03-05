import java.util.ArrayList;
import java.util.Date;

public class Account {
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date date;
	private ArrayList<Transaction> transaction ;
	
	
	public Account()
	{
		this(0,0,0);
		date=new Date();
	}
	
	public Account(int id,double  balance,double annualInterestRate)
	{
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
		transaction=new ArrayList<Transaction>();
		date=new Date();
	}

	public Account(String name, int id, double balance, double annualInterestRate) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		transaction=new ArrayList<Transaction>();
		date=new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDate()
	{
		return this.date;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate()
	{
		return (this.annualInterestRate/100)/12;
	}
	public double getMonthlyInterest()
	{
		return this.balance * getMonthlyInterestRate();
	}
	public void widraw(double amt)
	
	{
		balance-=amt;
		Transaction t= new Transaction('W', amt, this.balance, "Withdraw from the acc");
		transaction.add(t);
		
	}
	public void deposit(double amt)
	{
		balance+=amt;
		Transaction t = new Transaction('D', amt, this.balance, "Deposited to the account");
		transaction.add(t);
	}
	
	public ArrayList<Transaction> getTransactions()
	{
		return transaction;
	}
	
	
	
	

}
