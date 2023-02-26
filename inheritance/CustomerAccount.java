package inheritance;

public class CustomerAccount  extends BankDetail
{
	String customername;
	String email;
	long accno;
	double balance;
	
	public CustomerAccount()
	{
		
	}
	public CustomerAccount(String bankname,String city,String ifsc,String customername,String email,long accno,double balance)
	{
		 super(bankname,city,ifsc);     // constructor chaining
		//  this.bankname=bankname;
		//  this.city=city;
		//  this.ifsc=ifsc;
		  this.accno=accno;
		  this.email=email;
		  this.balance=balance;
		  this.customername=customername;
	}
	
	public void displayCustomerDetail()
    {
		 
		displayBankDetail();
        System.out.println("name of customer  is :-  "+customername);
        System.out.println("email  is :-  "+email);
        System.out.println("Accno  is :-  "+accno);
        System.out.println("Balance  is :-  "+balance);
            
          
    }
	
}
