package bankaccountapp;

public class Savings extends Account {
	
	// list properties specific to Savings account
	int safetyDepositBoxID;
	int safetyDepositKey;
	
	// Constructor to initialize Savings class properties
	public Savings(String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		setsafetyDepositBox();
		
	}
	// list methods specific to Savings account
	
	public void setsafetyDepositBox()
	{
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositKey=(int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo()
	{
		
		System.out.println("Account Type :Savings ");
		super.showInfo();
		System.out.println("Safety Deposit Box ID : "+safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key : "+safetyDepositKey);
		System.out.println("Rate of Interest : "+rate+ "%");
	}

	@Override
	 public void setBase()
	 {
		rate=getBase() - .25;	
	 }
}
