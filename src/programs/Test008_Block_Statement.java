package programs;

public class Test008_Block_Statement 
{
//A variable declaration within a block is not visible outside of the block.
	//A variable's range of visibility is know as the variable's scope
	public static void main(String[] args) 
	{

		int student=40;
		int rooms=4;
		if(rooms > 0.0) 
		{
			System.out.println(student);
			System.out.println(rooms);
			float avg=student/rooms;
			System.out.println(avg);
		}
		//System.out.println(avg);
	}

}
