package abstract2;

public abstract class Bank 
{
    static double amount;
    String cname;
	long accno;
	String bankName;
    String city;
	
    public Bank()
	{
		//System.out.println("Abstract default Costructor  ");
	}
	
	 public Bank(double amount, String cname, long accno, String bankName, String city)
	 {
		super();
	    Bank.amount = amount;
		this.cname = cname;
		this.accno = accno;
		this.bankName = bankName;
		this.city = city;
		//System.out.println("Abstract parameter Costructor  ");
	}


     public abstract void  deposit(double amount);
	 public abstract void  widraw(double amount);
	 
	 public static void thankyou()
	 {
		 System.out.println("Thank you So Much visit again");
	 }
	 
	 public static void Welcome()
	 {
		 System.out.println("Welcome to  YES bank");
	 }
	 
	public void Balance() 
	 {
	  
		 System.out.println("Balance Amount is  :-   "+amount);
	 }
	
	
	public void showCustomerDetails()
	{
	      
	     System.out.println("Bank Name  is "+bankName);
		 System.out.println("City r is "+city);
	     System.out.println("Customer name is "+cname);
		 System.out.println("Customer account number is "+accno);
		 
	}

}
