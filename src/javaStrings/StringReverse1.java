package javaStrings;

public class StringReverse1 
{

	public static void main(String[] args) 
	{
		String str="jakkula";
		String[] arrays=str.split(" ");
		String reverString="";
		
		for(int i=0;i<arrays.length;i++) 
		{
			String array1=arrays[i];
			System.out.println(array1);
			String rev="";
			for(int j=array1.length()-1;j>=0;j--) 
			{
				rev=rev+array1.charAt(j);
			}
			reverString=rev+"";
			System.out.println(reverString);
		}
		

	}

}
