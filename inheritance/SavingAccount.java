package inheritance;

public class SavingAccount extends CustomerAccount
{
    double amount;
	public SavingAccount() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public SavingAccount(String bankname,String city,String ifsc,String customername,String email,long accno,double balance,double amount)
	{
		  super(bankname,city,ifsc,customername,email,accno,balance);
		  this.amount=amount;
	}
	
	public void displaSavingAccount()
    {
		
        System.out.println("name of amount   is :-  "+amount);
       
            
          
    }

}
