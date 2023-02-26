package inheritance;

public class BankDetail 
{
	 String bankname;
	 String ifsc;
	 String city;
	 
	 public BankDetail()
	 {
		 
	 }
	  public BankDetail(String bankname ,String ifsc,String city)
	 {
		 this();
		 this.bankname=bankname;
		 this.city=city;
		 this.ifsc=ifsc;
		 
	 }
	 
	 public void displayBankDetail()
	 {
		 System.out.println("Bank name is "+bankname);
		 System.out.println("Bank IFSC code  is "+ifsc);
		 System.out.println("Bank city is "+city);
	 }

}
