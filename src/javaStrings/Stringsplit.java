package javaStrings;

public class Stringsplit 
{

	public static void main(String[] args) 
	{
		String str = new String("babu/gayu/nithu/chiru");
		String array1[]= str.split("/");
		for (String temp: array1)
		{
		      System.out.println(temp);
		}
		

	}

}
