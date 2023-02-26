package Interface;
import java.util.Scanner;
import abstract2.Bank;

public class BankDriver 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Bank2 c1=new Bank2(5000);
		
		char key;
		    do
		    {
		                                    
		      System.out.println("S : Bank name");
		      System.out.println("M  : Customer Details");
		      System.out.println("B : Balanace check");
		      System.out.println("C : Deposit");
		      System.out.println("D: debited");
		      System.out.println("E : Exit");
		      System.out.println("Enter the Key ");
		      key=sc.next().charAt(0);
		      
		      switch (key)
		       {
				 case  'S' : c1.welcome(); break;  // static method  in interface  we can use class name refrence
				 case 'M' : c1.name("Ashutosh ", "Jain "); break;
				
				 case 'B' : c1.Balance(c1); break;
				 
				 case 'C' : c1.deposit(400); break;
				 
				 case 'D' : c1.widraw(500); break;
				 
				 }
		      
		      
		    }while(key!='E');
		    
		
	}

}
