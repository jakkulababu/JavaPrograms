package logics;

public class CharAtExample3 
{

	public static void main(String[] args) 
	{
		String str="JavaString";
		int x=str.length();
		for(int i=0;i<str.length();i++)
		System.out.println(i+ "index Character :"+str.charAt(i));
		System.out.println("Character last index is:"+str.charAt(str.length()-1));
		
		char array=str.ToCharArray();
		for(int i=0;i<array.length();i++)
		{
			System.out.println(i);
		}
		
	}

}
