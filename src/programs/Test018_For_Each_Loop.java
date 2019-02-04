package programs;

public class Test018_For_Each_Loop 
{
//executes a statements once for each member in an array
	//-Handles getting collection length
	//Handles accessing each value
	//for(loop-variable-declaration:array)
	//Statements;
	public static void main(String[] args) 
	{
		float[] theVals= {2.0f,4.0f,43.98f};
		float sum=0.0f;
		for(float currentVal:theVals) 
		{
			sum +=currentVal;
			System.out.println(sum);
		}

	}

}
