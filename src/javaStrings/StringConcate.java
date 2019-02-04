package javaStrings;

public class StringConcate 
{

	public static void main(String[] args) 
	{
		String str1="Jakkula";
		String str2="Jakkula";
		
		System.out.println("Str1 is equal to "+str1.compareTo(str2));
		
		String str3="Jakkula";
		String str4="Babu";
		String str5=str3.concat(" "+str4);
		System.out.println(str5);    

	}

}
