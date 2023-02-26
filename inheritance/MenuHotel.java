package inheritance;
import java.util.Scanner;
public class MenuHotel {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price  roti");
		double roti=sc.nextDouble();
		System.out.println("Enter the price  bhakri");
		double bhakri=sc.nextDouble();
		System.out.println("Enter the price  tandoor");
		double tandoor=sc.nextDouble();
		
		System.out.println("-------------VEG-----------------");
		System.out.println("Enter the price  panner");
		double paneer=sc.nextDouble();
		System.out.println("Enter the price  dal");
		double dal=sc.nextDouble();
		System.out.println("Enter the price  kajukari");
		double kajukari=sc.nextDouble();
		
	    //Hotel h1=new Hotel(roti,tandoor,bhakri);
	    //h1.displayHotel();
	    
	    VEG v1=new VEG(roti,tandoor,bhakri,paneer,dal,kajukari);
	    v1.displayVEG(); // first refrence  local method
	    
	    v1.displayHotel();
	    
	    
	    
	}

}
