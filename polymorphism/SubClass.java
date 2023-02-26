package polymorphism;

public class SubClass extends SuperClass
{

		  static double x=100.02;
		  int y=56;
	public SubClass() 
	{
		// TODO Auto-generated constructor stub
	}
		public SubClass(int a,int b)
		{
			super(a,b);
		}
		 public void Mul()
		 {
		    //super.Mul();
			int c =a*b;
			System.out.println("Mul from Sub class is :-  "+c);
		  } 
		
	 public static void Div()
		 {
			//int c =s1.a/s1.b;
			System.out.println("Div from Sub  class is :-  ");
		  } 



}
