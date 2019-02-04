package javaStrings;

public class StringCompare 
{

	public static void main(String[] args) 
	{
		String str1="Babu";
		String str2="Babu";
		boolean str3;
		str3=str1==str2;
		System.out.println(str3);
		
		System.out.println(str1==str2);
		if(str1==str2) 
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Do not come");
		}

	}

}
