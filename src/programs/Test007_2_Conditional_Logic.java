package programs;

public class Test007_2_Conditional_Logic 
	{
	//relation operators
	//Greater than >
	//Greater than or equal to >=
	//Less than <
	//Less than or equal to <=
	//Equal ==
	// Not Equal  !=
	
	
	//Conditional assignments
	//The if Statement
	//Logical operation
		public static void main(String[] args) 
		{
			char a='A';
			char b='B';
			char c='C';
			char d='D';
			if(a==b || a!=c && a<d || b>d)
			
			{
				//System.out.println("A is greater than b and C");
				System.out.println("True");
			}
			else 
			{
				//System.out.println("A is less than B and C");
				System.out.println("False");
			}
		}
		
	}
