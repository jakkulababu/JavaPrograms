package programs;

public class Test014_Do_While {

	public static void main(String[] args) 
	{
		//Repeatedly executes a statement as long as the condition is true
		//Condition checked at look end
		//Statement always executes at least once
		int xVal=5;
		int fact=1;
		do 
		{
			fact *=xVal--;
			System.out.println(fact);
		}
		while(xVal>1);
		System.out.println("Final result is :"+fact);
	}

}
