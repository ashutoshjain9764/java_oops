package abstraction;

public class Square extends Shape
{
        float side;
	//Default 
	public Square() 
	{
		this.side = 2.0f;
	}



     // Parametrized
	public Square(float side)
	{
		this.side = side;
	}




	@Override
	void calArea() 
	
	{
		area=side*side;
	}



}
