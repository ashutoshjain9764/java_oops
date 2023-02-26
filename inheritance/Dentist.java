package inheritance;

public class Dentist extends Docter
{

	public String depar;
	public String Mdegree;
	public String location;
	
	
      public Dentist() 
		{
			// TODO Auto-generated constructor stub
		}
	
	  public Dentist(int id,String dname,String degree,String Mdegree,String depar,String location) 
		{
			super(id, dname, Mdegree);
			this.depar=depar;
			this.Mdegree=Mdegree;
			this.location=location;
		}
		
		public void displayDetailDentist()
		{
			System.out.println("Deaparment of  Docter  :- "+depar);
			System.out.println("Master degree of  Docter  :- "+Mdegree);
			System.out.println("Location of  Docter  :- "+location);
		}
	}



