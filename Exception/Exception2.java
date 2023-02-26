package Exception;

import java.util.*;
import java.util.Scanner;

public class Exception2 {

	Scanner sc=new Scanner(System.in);
	

	public Exception2()
	{
		
	}
	public  void arithmaticExpetion() 
	{
		try
		{
		  int arr[]= {5,7,45,96};
		System.out.println("Enter the 1 st ");
		int a=sc.nextInt();
		System.out.println("Enter the 2 nd ");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Result is :-  " +c);
		System.out.println(arr[8]);
		}
		
		catch(NullPointerException e1)
		{
			System.out.println("This NUll point Exception  " +e1);
		}
		catch(InputMismatchException e1)
		{
			System.out.println("This InputMismatch Exception  " +e1);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("This ArrayIndexOutOfBoundsException Exception  " +e1);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Arthmatic exception "+e1);
		}
		
		
		finally
		{
			System.out.println("thank you ");
		}
	}

	public static void main(String[] args)
	{
		Exception2 e1=new Exception2();
		e1.arithmaticExpetion();

	}

}
