package programs;
// boolean equals (object another) - check the equality of another object
// equalsIgnoreClass - compare another string without matching the case
// length(); - return a string length
// charArt(); - return a charter in index i
// toUpperCase(); - return string all character in upper case
// toLowerCase(); - return string all character in Lower case
// replace(old value, new value)
// trim() - remove white space from beginning of the string and end of the string
// Contains() - to check the string contains value
// ToCharArray() - Converting string into new char arrya
public class Test_4_Strings 
{

	public static void main(String[] args) 
	{
		String str1="BaBu";
		int x=str1.length();
		String str2="Welcome";
		
		System.out.println(x+str2);
		
		String str3=new String("Jakkula");
		System.out.println(str3);
		String str4="Jakkula Babu";
		int y=str4.charAt(8);
		System.out.println(y);
		String str5=str4.toUpperCase();
		System.out.println(str5);
		String str6=str4.toLowerCase();
		System.out.println(str6);
		String str7=str4.replace("Babu", "Gayathri");
		System.out.println(str7);
		String str8=str4.trim();
		System.out.println(str8);
		
		char[] str9=str4.toCharArray();
		System.out.println(str9[4]);
		
		//Is empty
		boolean str10=str4.isEmpty();
		System.out.println(str10);
		
		//endWith()
		//String str11=str4.endsWith(str8);
		String str12=str4.concat(str7);
		System.out.println(str12);
		
		String str13="jakkulababu1979@gmail.com";
		if(str13.contains("@") && str13.contains(".com")) 
		{
			System.out.println("Valid gmail ID....!");
		}
		else
		{
			System.out.println("Invalid email id...!");
		}
	}

}
