package javaStrings;
public class StringReverse2 
{
	public static void main(String[] args) 
	{
		String myStr="jakkula...!.*.. babu";
		String revers = reverseString(myStr);
		System.out.println(myStr+": reverse is : "+revers);
	}
	private static String reverseString(String myStr) 
	{
		if (myStr.isEmpty())
		{
			 //System.out.println("String in now Empty");	
			 return myStr;
		}
		else 
		{
			//Calling Function Recursively
			//System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
			return reverseString(myStr.substring(1)) + myStr.charAt(0);
		}
	}

}
