package inheritance;
import java.util.Scanner;
public class DocterDriver {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the name docter");
			String dname=sc.nextLine();
			System.out.println("Enter the degree docter");
			//sc.nextLine();
			String degree=sc.nextLine();
			System.out.println("Enter the id  docter");
			int id=sc.nextInt();
			System.out.println("***************************");
			 sc.nextLine();
			System.out.println("Enter the deparment docter");
			String depar=sc.nextLine();
			System.out.println("Enter the  master degree docter");
			//sc.nextLine();
			String Mdegree=sc.nextLine();
			System.out.println("Enter the location  docter");
			String location=sc.next();
			
			 Dentist d3=new Dentist(id, dname, degree, Mdegree, depar,location);
			// d3.displayDetailDentist();
			// d3.displayDetailDocter();
			
			Docter d1=d3; // upcasting sub class refrance convert  super class refrence types only use super class member
			//d1.displayDetailDocter();
			//d1.displayDetailDentist();    CTE  cannot use sub class member
			
			//Docter d2=new Docter(id, dname, Mdegree);
			 
			Dentist d4=(Dentist)d1;   // downcasting super class refrance convert  sub  class refrence types use  both member
			                           // upcasted done first then downcasting done 
			
			d4.displayDetailDentist();
			d4.displayDetailDocter();
			
			
			
		
		}
		
		

	}

}
