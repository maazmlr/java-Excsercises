import java.util.Date;

public class Transaction {

	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String des;
	
	public Transaction()
	{
		
	}

	public Transaction(char type, double amount, double balance, String des) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.des = des;
		date=new Date();
	}

	public Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
}
