package programs;
import java.util.Scanner;
public class Test015_Do_While 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int x=sc.nextInt();
		int y=0;
		int res;
		System.out.println("Table");
		do 
		{
			res =x*++y;
			System.out.println(x+" * "+y+" = "+res);
		}
		while(y<10);
	}
}