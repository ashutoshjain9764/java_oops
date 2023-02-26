package abstract2;
import java.util.Scanner;
public class UserBank {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
	    Bank s1=new Customer("YES Bank","savkheda",50000, "Ashutosh  S Jain", 336467256);
	    char key;
	    do
	    {
	       Bank.Welcome(); // static method use class name refrence
	      System.out.println("S  : Detail");
	      System.out.println("B : Balanace check");
	      System.out.println("C : Deposit");
	      System.out.println("D: debited");
	      System.out.println("E : Exit");
	      System.out.println("Enter the Key ");
	      key=sc.next().charAt(0);
	      
	      switch (key)
	       {
			 case 'S':  s1.showCustomerDetails(); break;
			 
			 case 'B' : s1.Balance(); break;
			 
			 case 'C' : s1.deposit(502); break;
			 
			 case 'D' : s1.widraw(200); break;
			 
			 }
	      
	      
	    }while(key!='E');
	    
	   
		
	    
	    
		 
		
		
	
	}

}
