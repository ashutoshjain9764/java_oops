package polymorphism;
import java.util.Scanner;
public class DriverMain
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1 st nu");
		int a=sc.nextInt();
		System.out.println("enter the 2 st nu");
		int b=sc.nextInt();
		SuperClass s1=new SubClass(a,b);
		
		s1.Mul();
		s1.Sum();
		s1.Sub();
		s1.Div(); // method shadowing
		System.out.println(s1.x); // variable shadowing
		System.out.println(s1.y); // variable shadowing
	}

}
