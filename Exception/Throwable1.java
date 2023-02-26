package Exception;
import java.util.Scanner;
public class Throwable1
{


	public static void main(String[] args) throws InterruptedException
	{
		

	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<4;i++)
	  {
	  System.out.println("Welcome");
	  Thread.sleep(2000);
	  }
	  
	  try
	  {
		  System.out.print("Enter 1 st value ");
	      int  a=sc.nextInt();
		  System.out.print("Enter 2 st value ");
		  int  b=sc.nextInt();
		  int c=a/b;
		 
		  
	
	  System.out.println("Result is :  "+c);
	  
	  }
	  catch(Exception b)
	  {
		  System.out.println("Exception  type "+b);
		 
	  }
	  catch(Throwable b)
	  {
		  System.out.println("Throwable  type "+b.getMessage());
		 
	  }
	  
	 
	  finally
	  {
		  System.out.println("thank you ");
	  }
	 
	  
	}

}
