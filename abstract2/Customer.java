package abstract2;

public class Customer extends Bank
{

	public Customer() 
	{
		// TODO Auto-generated constructor stub
	
	}
	public Customer(String bankName, String city,double amount, String cname, long accno)
	{
	  super(amount, cname, accno, bankName, city);
	}
	


	public void deposit(double Camount)
	{
		amount=  amount + Camount;
		System.out.println("amount must credited is "+Camount);
		thankyou(); // static method of abstract class inherited

		
    }
	public void  widraw(double Damount)
	{
		
		amount=  amount - Damount;
	    System.out.println("amount must debited is "+Damount);
		thankyou(); // static method of abstract class inherited

    }
	

	
	
	
}