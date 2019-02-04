package JavaString1;

public class StringBuilder {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("jakkula");
		StringBuffer sb2=new StringBuffer("jakkula");
		sb1.append("Babu");
		System.out.println(sb1);
		sb1.reverse();System.out.println(sb1);
		if(sb1==sb2) 
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}

}
