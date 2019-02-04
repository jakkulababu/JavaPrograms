package programs;

public class Test004_Type_Conversion 
{
	public static void main(String args[]) 
	{
		//implicit type conversion
		//Conversions performed automatically by the compiler (Java Runtime Environment)
		
		byte b = 50;
		int in = b;
		System.out.println(in);
		
		//Explicit type conversion
		//Conversions performed explicit in code with cast operator canceling 4 bytes and converting into 1 byte
		
		int iVal = 127;
		System.out.println(iVal);
		byte bVal = (byte) iVal;
		// if not (byte) then we will get Exception in thread "main" java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from int to byte
		
		System.out.println("Sucess");
		
		
		
	}
}

