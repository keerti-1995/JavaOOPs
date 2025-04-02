package Account;

import java.util.Date;

public class Account {
	private Number accountNumber;
	private String Name;


	
	public Account(int accountNumber, String Name) {
		this.accountNumber = accountNumber;
		this.Name = Name;
	}
	//1.Access modifier,2. return type,3.methodname,4.args
	public Number getaccountNumber()
	{
		return this.accountNumber;
	}
	
	public String getName() {
		return this.Name;
	
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void printDetails() {
		System.out.println("Name: " + this.Name + " and Account Number is " + this.accountNumber);
	}
	
	
}
