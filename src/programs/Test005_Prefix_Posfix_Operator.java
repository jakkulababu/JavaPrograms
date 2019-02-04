package programs;

public class Test005_Prefix_Posfix_Operator 
{

	public static void main(String[] args) 
	{
		//++ increment by 1 as Prefix applies operation before returning value
		//-- decrement by 1
		
		int x=10;
		x=++x;
		System.out.println("X initial value is 10 after Prefix symbol ++x it will incremented by 1:"+x);//Prefix value it means incremented by 1
		int y=5;
		y=y++;
		System.out.println("Y initial value is 5 before Postfix symbol y++ it means it will not increment by 1:"+y+"\n");//Postfix value it means it will not increment by 1
		
		//-- decrement by 1
		
		int a=10;
		a=--a;
		System.out.println("A initial value is 10 after Prefix symbol --x it will decrement by 1:"+a);//Prefix value it means incremented by 1
		int b=10;
		b=b--;
		System.out.println("B initial value is 10 before Postfix symbol y++ it means it will not decrement by 1 initialy:"+b);//Postfix value it means it will not increment by 1
		
		
	}

}
