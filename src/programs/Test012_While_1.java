package programs;

public class Test012_While_1 {

	public static void main(String[] args) 
	{
		//Repeatedly executes a statement as long as the condition is true
		//Condition checked at loop at start
		//Statement may never execute
		int kVal=7;
		int factorial=1;
		while(kVal>1) 
		{
			factorial *=kVal;
			//System.out.println(factorial);
			kVal-=1;
			//System.out.println(kVal);
		}
		System.out.println(factorial);
		//initial factorial is 1
		//1*5='5'
		//factorial is 5
		//5-1=4, 5*4='20'
		//factorial is 20
		//4-1=3, 20*3='60'
		//factorial is 60
		//3-1=2, 60*2='120'
		//factorial is 120
		//2-1=1, 120*1='120' 
		//Result will be 120
		//1-1=0 !>1, end of the while loop'
	}

}
