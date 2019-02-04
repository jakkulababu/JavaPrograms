package programs;
//Transfers control to a statement based on a value
//simplifies testing against multiple possible matches
//Only primitive types supported are char and integer
//A match can execute more than one statements
//Use break to avoid "falling through"
//can optionally include default to handle any unmatched values
public class Test019_Switch 
{

	public static void main(String[] args) 
	{
		int iVal=10;
		switch(iVal%2) 
		{
		case 0:
			System.out.println("Value is even: "+iVal);
			break;
		case 1:
			System.out.println("Value is Odd: "+iVal);
			break;
		default:
			System.out.println("none of the above!!!!!");
			break;
		}



	}

}
