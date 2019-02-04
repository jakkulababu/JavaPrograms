package javaStrings;

public class GetBytes 
{
	public static void main(String[] args) 
	{
		String s="Babu";
		byte[] b=s.getBytes();
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(i+" Byte stands at: "+b[i]);
		}
		String s2=new String(b);
		System.out.println(s2);
	}
}