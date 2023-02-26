package relationship;

public class Engine
{
	 public String Fuel;
	    public String cc;
	    public String Type;
	    public long id ;
	    public Engine(String Fuel,String cc, String Type,long id)
	    {
	        this.Fuel=Fuel;
	        this.cc=cc;
	        this.Type=Type;
	        this.id=id;
	    }

	    public void displayEngine()
	    {
	        System.out.println("Fuel is :-  "+Fuel);
	        System.out.println("Type  is :-  "+Type);
	        System.out.println("cc  is :-  "+cc);
	        System.out.println("Id is :-  "+id);
	    }


}
