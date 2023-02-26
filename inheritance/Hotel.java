package inheritance;

public class Hotel
{
     double roti;
     double tandoor;
     double bhakri;
	

	public Hotel() 
	{
		// TODO Auto-generated constructor stub
	}
	
    public Hotel( double roti , double  tandoor, double bhakri)
	{
		this.roti=roti;
		this.bhakri=bhakri;
		this.tandoor=tandoor;
	}
    
    public void displayHotel()
    {
    	System.out.println(" Menu In Roti ");
    	System.out.println("Price of roti is :-  "+roti);
    	System.out.println("Price of bhakri is :-  "+bhakri);
    	System.out.println("Price of tandoor is :-  "+tandoor);
    }
	

}
