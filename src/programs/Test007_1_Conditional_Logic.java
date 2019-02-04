package programs;

public class Test007_1_Conditional_Logic 
{
	public static void main(String args[])
	{
		int x=7;
		int y=5;
		
		int result1 = x > y ? x : y;//Condition ? True-value : false-value
		System.out.println(result1);
		
		int result2 = x < y ? x : y;//Condition ? false-value : True-value 
		System.out.println(result2);
		
		
		int result3 = x == y ? x : y;//Condition ? false-value : True-value
		System.out.println(result3);
		
		int result4 = x != y ? x : y;//Condition ? True-value : false-value
		System.out.println(result4);
		
		
		int result5 = x >= y ? x : y;//Condition ? True-value : false-value
		System.out.println(result5);
		
		int result6 = x <= y ? x : y;//Condition ? false-value : True-value
		System.out.println(result6);
		
		
		
	}
}
