package programs;
public class Flight 
{
	public int passangers;
	public int seats;
	public Flight()
	{
		seats=150;
		passangers = 0;		
	}
	public void add1Passanger() 
	{
		if(passangers < seats) 
		{			passangers+=1;	}
		else{	handleTooMany();}
	}
	public void handleTooMany() 
	{
		System.out.println("Too Many");
	}
}