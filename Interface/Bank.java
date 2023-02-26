package Interface;

public interface Bank
{

	       double limit=3000;              // by default prefix with static ,final  and public
		
	       String bank="Axis bank";                   // by default prefix with static ,final  and public
		   
	       public static final String  city="Jalgaon";         // by default prefix with static ,final  and public
		     
		
	      public abstract void  deposit(double amount);    // by default prefix abstract  and public
		  
	      abstract void  widraw(double amount);        // by default prefix abstract  and public 
		  
	      void  name(String Fname, String Lname);  // by default prefix abstract  and public 
		
	      
	    
	      
		public static void thankyou()    // we can declare static method but cannot overided or inherited
		 {
			 System.out.println("Thank you So Much visit again");
		 }
		 
		
		public default void Default()  // default method in interface  inherited 
		 {
			 System.out.println("This is default method i iterface");
		 }
		 
		
		
		

	}



