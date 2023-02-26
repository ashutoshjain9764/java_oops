package wrapper;

public class IntToString {

	public static void main(String[] args)
	{
		int a=45;
		String s=String.valueOf(a);
		System.out.println("Converting int to string  :- "+s);
		

		double b=45.544;
		String s2=String.valueOf(b);
		System.out.println("Converting int to string  :- "+s2+9);
		
		
		// String s3="xyx";
		// int c=Integer.parseInt(s3);  // NumberFormatException occured
		
		String s3="456";
		int c=Integer.parseInt(s3);  // String to respetive data support 
		System.out.println(c);
		System.out.println((c+4)+ " ");
		
		String s4="c";
		char e=s4.charAt(0);  // String to respetive data support 
		System.out.println(e);
		
	}

}
