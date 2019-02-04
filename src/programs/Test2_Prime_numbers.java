package programs;

import java.util.Scanner;

//find a prime number
public class Test2_Prime_numbers
{
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("starting value: ");
		int x=sc.nextInt();
		System.out.println("Enter the end value:");
		int y=sc.nextInt();
		for(int i=x;i<y;i++) 
		{
			boolean flag=true;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					flag=false;
					break;
				}
					
			}
			if(flag==true) 
			{
				System.out.println(i);
			}
		}
	}
}
