package bankaccountapp;

public interface IBaseRate {
	
	
	//write a method to return the base rate
	default double getBase()
	{
		return 2.5;
	}

}
