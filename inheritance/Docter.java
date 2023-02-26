package inheritance;

public class Docter 
{
	public int id;
	public String dname;
	public String degree;
	
	public Docter() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Docter(int id,String dname,String degree) 
	{
		this.id=id;
		this.dname=dname;
		this.degree=degree;
	}
	
	public void displayDetailDocter()
	{
		System.out.println("name of  Docter  :- "+dname);
		System.out.println("id of  Docter  :- "+id);
		System.out.println("degree of  Docter  :- "+degree);
	}
}
