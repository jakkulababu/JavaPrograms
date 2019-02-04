package programs;

import java.util.Scanner;

public class Test013_While_2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value");
		int kVal=sc.nextInt();
		int fact=1;
		System.out.print(kVal);
		while(kVal>1) 
		{
			fact *=kVal--;
		}
		System.out.println(" Factorial is :"+fact);
		
		//1*5=5
		//5*4=20
		//20*3=60
		//60*2=120
		//120*1=120
		//Final reuslt will be 120
	}

}
