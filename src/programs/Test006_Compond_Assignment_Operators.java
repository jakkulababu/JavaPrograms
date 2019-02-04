package programs;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test006_Compond_Assignment_Operators 
{

	public static void main(String[] args) 
	{
		int myVal1=50;
		myVal1-=5;
		System.out.println("50-5="+myVal1);
		
		int myVal2=50;
		myVal2+=5;
		System.out.println("50+5="+myVal2);
		
		int myVal3=50;
		myVal3*=5;
		System.out.println("50*5="+myVal3);
		
		int myVal4=50;
		myVal4/=5;
		System.out.println("50 Divident / 5 Divisor and Quotient is ="+myVal4);
		  
		int myVal5=50;
		myVal5%=5;
		System.out.println("50 Divident % 5 Divisor and Reminder is="+myVal5);
		
		double reuslt=100, myVal7=5,myVal8=6;
		reuslt /= myVal7 * myVal8;
		System.out.println("100/(5*6) it means 100/30 quotient is = 3.333 and reminder is 0.0: ==="+reuslt);

	}

}
