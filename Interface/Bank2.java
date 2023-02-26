package Interface;

public class Bank2 implements Bank
{ 
	double amount;
    
	public Bank2(double amount)
	{
		super();
		this.amount = amount;
	}

	@Override
	public void deposit(double Camount)
	{
		amount =  amount + Camount;
		System.out.println("amount must credited is "+Camount);
		Bank.thankyou(); // static method in interface cannot  inherited but call using interface name refrence 
         Default();    // default method in interface  inherited 
	}

	
	@Override
	public void widraw(double Damount)
	{
		
		 if(amount-Damount > limit)     // static variable is inherited
		 {
			amount =  amount - Damount;
			System.out.println("amount must credited is "+Damount);
			Bank.thankyou(); // static method in interface cannot  inherited but call using interface name refrence 
         }
		 else
		 {
			 System.out.println("Sorry insuficient Balance  ");
		 }
	}

	  public static  void  welcome()
		{
		    System.out.println("Bank name is :  "+bank);
		    System.out.println("City is :  "+city);
		}
	 
	@Override
	public void name(String Fname, String Lname)
	{
		System.out.println("Customer Name is :  "+Fname+ " "+Lname);
		
	}
	
	public static void Balance(Bank2 b2)
	 {
		 System.out.println("Balance is :- "+b2.amount); 
		
	 }
	
	
	
	
	

}
