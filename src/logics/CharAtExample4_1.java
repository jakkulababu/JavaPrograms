package logics;

public class CharAtExample4_1 
{
	public static void main(String[] args) 
	{
		String str="Jakkula";
				//  0123456
		System.out.println(str.length());
		for(int i=0;i<str.length();i++) 
		{
			if(i/2!=0) 
			{
				System.out.println("Character index "+i+" place is:"+str.charAt(i));
			}
		}

	}

}
