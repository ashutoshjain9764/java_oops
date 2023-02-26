package inheritance;

public class VEG extends Hotel
{
    double paneer;
    double dal;
    double kajukari;
	
    public VEG()
	{
		// TODO Auto-generated constructor stub
	}
    
    public VEG(  double roti, double tandoor, double bhakri , double paneer, double dal, double kajukari)
	{
		super(roti,tandoor,bhakri);
		this.dal=dal;
		this.kajukari=kajukari;
		this.paneer=paneer;
	}
    
    public void displayVEG()
    {
    	
    	
    	System.out.println(" Menu In VEG prices ");
    	System.out.println("Price of paneer :-  "+paneer);
    	System.out.println("Price of dal  :-  "+dal);
    	System.out.println("Price of kajukari :-  "+kajukari);
    }
	
    public void displayHotel()
    {
    	super.displayHotel(); // method overiding using super keyword
    	System.out.println(" Menu In VEG prices ");
    	System.out.println("Price of paneer :-  "+paneer);
    	System.out.println("Price of dal  :-  "+dal);
    	System.out.println("Price of kajukari :-  "+kajukari);
    }

}
