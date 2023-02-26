package abstraction;

public abstract class Shape 
{
	
	    protected  static double area ;
	   //abstract method
		abstract void calArea(); 
		
		//concrete method
	 void show()
		{
			System.out.println("Area of shape is: "+area);
		}

}
