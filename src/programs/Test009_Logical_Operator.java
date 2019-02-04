package programs;

public class Test009_Logical_Operator 
{

	public static void main(String[] args) 
	{
		int a=50;
		int b=43;
		int c=40;
		
		if(a > b & b > c)// if both the statement are true then final result will be true
			{
				System.out.println("1. logical & (And) test Passed");//what resolves to True- true&true
			}
		else 
			{
				System.out.println("1. logical & (And) test Failed");
			}
		 
		
		if(a > b | b < c)//false|true or true|false or true|true, result will be true, if false|false then result will be false
			{
				System.out.println("2. logical | (Or) test Passed");//what resolves to True- true&true
			}
		else 
			{
				System.out.println("2. logical | (Or) test Failed");
			}
		
		
		if(a < b ^ b > c)//false^true , true^false result will be true, if false^false result will be false, but it can not be True^true
			{
				System.out.println("3. logical ^ (Exclusive or(XOR)) test Passed");//what resolves to True- true&true
			}
		else 
			{
				System.out.println("3. logical ^ (Exclusive or(XOR)) test Failed");
			}
		
		boolean done=false;
		if(!done) 
		{
			System.out.println("4. ! (Negation) test passed");
		}
		else 
		{
			System.out.println("4. ! (Negation) test failed");
		}
	}

}
