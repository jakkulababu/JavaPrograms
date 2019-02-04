package JavaString1;

public class Split {

	public static void main(String[] args) 
	{
		/*String str="25-01-2019";
		String array[]=str.split("-",3);
		for(String temp:array) {System.out.println(temp);}*/
		
		String s = new String("bbaaccaa");
		
		//Splitting with limit as 0
		String arr2[]= s.split("c", 4);
		System.out.println(s+"\nZero Limit split:");
		for (String str3: arr2){
		   System.out.println(str3);
		}

		//Splitting with negative limit
		String arr1[]= s.split("a", -1);
		System.out.println("Negative Limit split:");
		for (String str4: arr1){
		   System.out.println(str4);
		}

	       System.out.println("End of program");

	}

}
