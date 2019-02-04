package JavaString1;

public class Format {

	public static void main(String[] args) 
	{
String str="Just a string";
		
		String formatedstring=String.format("My String is %s Babu Gayu Nitesh Chiru", str);
		
		System.out.println(formatedstring);
		
		double d=12.203040;
		float f=(float) 24.405060;
		String formatedstring1=String.format("My String is %.6f", d);
		System.out.println(formatedstring1);
		
		long l=1234;
		String formatedstring2=String.format("My int is %d", l);
		System.out.println(formatedstring2);


	}

}
