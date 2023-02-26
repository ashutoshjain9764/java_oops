package encapsulation;

public class Encapsulation {

	public static void main(String[] args) 
	{
		BankDetail d1=new BankDetail();
		//d1.display();
		
        BankDetail b2=new BankDetail("Axis Bank ", "Ashutosh Suresh Jain","ashujain@gmail.com","CBI01819",336467034,7890,50000);
        b2.display();
		d1.setBalance(2000);
		d1.setAccno(33646703);
		d1.setEmail("Ashujain98=764@gmail.com");
		d1.setIfsc("CBIN01961");
		d1.display();
		
		

	}

}
