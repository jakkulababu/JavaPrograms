package JavaString1;

public class Equals_EqualsIgnoreCase_EndsWith {

	public static void main(String[] args) 
	{
		String str1="JAKKULA babu";
		String str2="jakkula babu";
		String str3="";
		if(str1.equals(str2)) {System.out.println("Test Passed");}else {System.out.println("Test Failed");}
		if(str1.equalsIgnoreCase(str2)) {System.out.println("Test Passed");}else {System.out.println("Test Failed");}
		
	}
}
