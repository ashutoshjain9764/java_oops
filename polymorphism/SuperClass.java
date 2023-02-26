package polymorphism;

public class SuperClass 
{
	 static double x=10.02;
	 int y= 20;
    int a,b;
	public SuperClass()
	{
		// TODO Auto-generated constructor stub
	}
	public SuperClass(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
  public void Sum()
	 {
		int c =a+b;
		System.out.println("Sum Super class  is :-  "+c);
	  } 
  
  public void Sub()
	 {
		int c =a-b;
		System.out.println("Sub Super class is :-  "+c);
	  } 
  public void Mul()
	 {
		int c =a/b;
		System.out.println("Mul from Super class is :-  "+c);
	  } 
  public static void Div()
	 {
		//int c =s1.a/s1.b;
		System.out.println("Div from Super class is :-  ");
	  } 

		
		
	

}
