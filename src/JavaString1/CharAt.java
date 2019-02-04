package JavaString1;
public class CharAt {
	public static void main(String[] args) 
	{
		String str1="Welcome To Java Developers";
		String str2=new String("");System.out.println("Length of Str1 is :"+str1.compareTo(str2));
		String str3=new String("Welcome To Java evelopers");
		
		System.out.println(str1.compareTo(str3));

		
		for(char c=0;c<str1.length();c++) {System.out.print(str1.charAt(c));}System.out.println();
		for(int i=0;i<str1.length();i++) {System.out.print(str1.charAt(i));}System.out.println();
		if(str1.compareTo(str1)>=0) {System.out.println("Test Passed");}else {System.out.println("\nTest failed");}				//compareTo
		if(str1.contains("java")) {System.out.println("Test Passed");}else {System.out.println("String contains Test failed");}				//contains
		if(str1.contentEquals(str3)) {System.out.println("Test Passed");}else {System.out.println("String contentEquals Test failed");}			//contentEquals
		if(str1.compareToIgnoreCase(str3)==0) {System.out.println("Test Passed");}else {System.out.println("String compareToIgnoreCase Test failed");}//compareToIgnoreCase   

		/*char ch=str1.charAt(0);System.out.println("Index 0 char stands : "+ch);					//CharAt()
		int it1=str1.charAt(1);System.out.println("Unicode for str1 0 index is : "+it1);
		byte b1=(byte) str1.charAt(2);System.out.println("Unicode for str1 0 index is : "+b1);
		short s1=(short) str1.charAt(3);System.out.println("Unicode for str1 0 index is : "+s1);
		double d1=str1.charAt(4);System.out.println("Unicode for str1 0 index is : "+d1);
		long l1=str1.charAt(5);System.out.println("Unicode for str1 0 index is : "+l1);
		float f1=str1.charAt(6);System.out.println("Unicode for str1 0 index is : "+f1);		
		System.out.println("comparint str1 to str3 it will give you length of str1 : "+str1.compareTo(str2));	//CompareTo
		System.out.println("Length of str1 is :"+str1.length());
		System.out.println("compare to ignore case: str1 to str3 is: "+str1.compareToIgnoreCase(str3));	//CompareToIgnoreCase
		System.out.println("Contact str1 and str3"+str1.concat(str3));	*/								//concat
	
	}
}