package javaStrings;

public class Test001 
{
	public static void main(String[] args) 
	{
		String s="JAKKULA";
		char ch=s.charAt(5);
		
		System.out.println(ch);
		System.out.println(s);
		
		char[] c= {'j','a','k','k','u','l','a'};
		
		String s1=new String(c);
		System.out.println(s1.length());
		
		
		
		String str1="Babu";
		String str2="Jakkula ";
		String str3;
		str3=str2+str1;
		System.out.println(str3);
		
	}

}
