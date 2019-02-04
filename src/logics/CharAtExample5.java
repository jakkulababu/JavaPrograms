package logics;

public class CharAtExample5 
{
	public static void main(String[] args) 
	{
		String str="jakkulababu";
		int count=0;
		for(int i=0;i<str.length()-1;i++) 
		{
			if(str.charAt(i)=='a') 
			{
				count++;
			}
		}
		System.out.println("Frequency of 'a' is: "+count);
	}
}