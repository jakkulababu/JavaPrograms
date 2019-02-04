package programs;

public class Test017_Arrays 
{
//provides an ordered collection of elements. each element accessed via an index
	//index range from 0 number of elements minus-1
	
	public static void main(String[] args) 
	{
		int[] myVal= {4,2,7};
		System.out.println(myVal[2]);
		
		float[] myFloat=new float[3];
		myFloat[0]=100.0f;
		myFloat[1]=101.2f;
		myFloat[2]=103.4f;
		float sum=0.0f;
		for(int i=0;i<myFloat.length;i++)
		{
			sum+=myFloat[i];
			
			System.out.println(sum);
		}
	}

}
