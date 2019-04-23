package bankaccountapp;

public abstract class Account  implements IBaseRate {

	// list all properties that are common to checking and savings account
	private String name;
	private String sSN;
	protected String accountNumber;
	private double balance;
	protected double rate;
	int index=10000;
	
	// constructor to set base properties and initialize the account
	 public Account(String name,String sSN,double initDeposit)
	 {
		 
		this.name=name;
		this.sSN=sSN;
		this.balance=initDeposit;
		index++;
		//set account number
		
		this.accountNumber=setAccountNumber();
		setBase();
		
	 }
	 
	 public abstract void setBase();
	 private String setAccountNumber()
	 {
		 String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		 int uniqueID=index;
		 int randomNumber=(int)(Math.random()*Math.pow(10, 3));
		 return lastTwoOfSSN + uniqueID+randomNumber;
	 }
	 
	 public void showInfo()
	 {
		 System.out.println("NAME : "+ name+
				 "\nAccount Number: "+accountNumber+
				 "\nBalance: "+balance);
	 }
	 
	 public void withdraw(double amount)
	 {
		 balance=balance-amount;
		 printBalance();
	 }
	 
	 public void deposit(double amount)
	 {
		 balance=balance+amount;
		 printBalance();
	 }
	 public void transfer(String toWhere,double amount)
	 {
		 balance=balance-amount;
		 System.out.println("Transfering "+amount+" to " +toWhere);
		 printBalance();
	 }
	 
	 public void compound()
	 {
		 double accruedInterest=balance*(rate/100);
		 balance=balance+accruedInterest;
		 printBalance();
	 }
	 
	 public void printBalance()
	 {
		 System.out.println("your current balance is $ " +balance);
	 }
	
	// list all methods that are common to checking and savings account
}
