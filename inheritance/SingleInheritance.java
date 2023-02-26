
package inheritance;

public class SingleInheritance 
{

	public static void main(String[] args)
	{
		CustomerAccount c1=new CustomerAccount("Axis bank","Jalgaon","CBIN01961","Ashutosh Suresh Jain","ashujain9764@gmail.com",333456767,5000);
		//c1.displayCustomerDetail();
		c1.displayBankDetail();
		
	     System.out.println(c1 instanceof BankDetail);

	}

}
