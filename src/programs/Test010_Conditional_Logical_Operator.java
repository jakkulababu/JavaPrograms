package programs;

public class Test010_Conditional_Logical_Operator 
{

	public static void main(String[] args) 
	{
		int x=30;
		int y=50;
		int a=90;
		
		if(y > x && a > y) // && only execute right-side if left-side is true
		{
			System.out.println("passed");
		}
		else 
		{
			System.out.println("Failed");
		}
		
		//x=30,y=50,a=90
		if(x > y || a < y) // || only execute right-side if left-side is false
		{
			System.out.println("passed");
		}
		else 
		{
			System.out.println("Failed");		
		}
	}

}
