package bankaccountapp;

public class Checking extends Account{
	
	int debitCardNumber;
	int debitCardPin;

	// list properties specific to checking account
	
	// Constructor to initialize Checking class properties
	
	public Checking(String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
	    setDebitCard();
	}
	
	public void setDebitCard()
	{
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo()
	{
		System.out.println("Account Type :Checking ");
		super.showInfo();
		System.out.println("Debit Card Number : "+debitCardNumber);
		System.out.println("Debit Card PIN : "+debitCardPin);
		System.out.println("Rate of Interest : "+rate+ "%");
		
	}
	
@Override
 public void setBase()
 {
	rate=getBase() * .15;	
 }
	// list methods specific to checking account
	
	
}
