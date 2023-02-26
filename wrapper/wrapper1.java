package wrapper;

public class wrapper1 {

	
	public static void main(String[] args)
	{
		int a=50;
		Integer i=new Integer(a); // boxing 
		Integer i2=a;             // autoboxing
		System.out.println("boxing is :"+i);
		System.out.println("auto2boxing is :"+i2);
		System.out.println("object class method overide "+i.toString());
		
		Double d=new Double(456.021);
		double d2=d.doubleValue();   //unboxing
	    double d3=d;                //autounboxing 
		System.out.println("unboxing is :"+d2);
		System.out.println("autounboxing is :"+d3);

	}

}
