package abstraction;

public class Rectangle extends Shape 
{
	   float width,height;

	    //default constructor
	  	public Rectangle() 
	  	{
		this.width = 5.0f;
		this.height = 3.0f;
	    }

	  //parametrized constructor
	  public Rectangle(float width, float height) 
	  	  {
			this.width = width;
			this.height = height;
		}

	  void calArea() 
		{
		     
			area=width*height;
			
		}
	  
	
	  


}
