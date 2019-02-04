package javaStrings;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		String str="Jakkula";
		String[] words = str.split(" ");
		String rs ="";
		System.out.println(words.length);
		for (int i = 0; i < words.length; i++)
		   {
		     String word = words[i]; 
		     String reverseWord ="";
		    for (int j = word.length()-1; j >= 0; j--) 
			   {
				reverseWord = reverseWord + word.charAt(j);
			   }
			   rs = rs + reverseWord + " ";
		   }
			System.out.println(str);
			System.out.println(rs);
	}
}