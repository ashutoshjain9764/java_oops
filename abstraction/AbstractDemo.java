package abstraction;

public class AbstractDemo {

	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.calArea();
		r.show();
		
		Square s=new Square();
		s.calArea();
		s.show();

		
		System.out.println(".....Parametrized call........");
		
		Shape s1;
		
		s1=new Rectangle(10.0f,20.f);  //loose coupling/dynamic binding
		s1.calArea();
		s1.show();

		s1=new Square(10);  //loose coupling/dynamic binding
		s1.calArea();
		s1.show();
		
		
		
		
	}

}
