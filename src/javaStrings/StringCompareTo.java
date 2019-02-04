package javaStrings;

public class StringCompareTo 
{

	public static void main(String[] args) 
	{
		String s1="Babu JaKKuLA";
		String s2="babu jakkula";
		String s3="Jakkula";
		String s4="Jakkula";		
		
		String s5=String.format(s1, s2);
		System.out.println(s5);
		/*if(s1.equals(s2) && s1.contains(s2) && s4.equalsIgnoreCase(s3)|| s2.contains(s1)) 
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}*/
		
		if((s1.equalsIgnoreCase(s2) || s1.contains(s2)) && s3.contains(s4) && s3.contentEquals(s4)) 
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}

}
