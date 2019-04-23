package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     List<Account> accounts=new LinkedList<Account>();
		//read a .csv file and create an account based on that data
		String file="/Users/agasa05/Documents/data.csv";
        List<String[]> newAccountHolders=utilities.CSV.read(file);
        for(String[] accountHolder:newAccountHolders)
        { 
         	String name=accountHolder[0];
        	String sSN=accountHolder[1];
        	String accountType=accountHolder[2];
        	double initDeposit=Double.parseDouble(accountHolder[3]);
        	if(accountType.equals("Savings"))
        	{
        		accounts.add(new Savings(name,sSN,initDeposit))	;
        	}
        	else if(accountType.equals("Checking"))
        	{
        		accounts.add(new Checking(name,sSN,initDeposit));
        	}
        	
        	else
        	{
        		System.out.println("Error Reading Account Type");
        	}
        }
        
        for(Account acc:accounts)
        {
        	
        	acc.showInfo();
        	System.out.println("\n");
        	System.out.println("**************");
        	System.out.println("\n");
        }
		
//		Checking chkacc=new Checking("Tom Wilson","123456789",1500);
//		Savings savacc=new Savings("Tom Wilson","123456789",2500);
//		chkacc.showInfo();
//		System.out.println("***********");
//		savacc.showInfo();
//		savacc.deposit(5000);
//		savacc.transfer("Brokerage", 4000);
//		savacc.withdraw(1000);
		
		

	}

}
