
public class Dice {
	private int roll;
	private static int OneThrow; //Lab 4
	private int maxSide = 6; //Lab 5 the default # of sides on a 6 sided dice is 6.
	
	public Dice() //Lab 3
	{
		Throw();
	}
	
	public Dice(int bounces) //Lab 3
	{
		Throw(bounces);
	}
	
	public void Throw() //Lab 1 return a random number between 1-6.
	{
		roll = 1 + (int)(Math.random()*6);
	}
	
	public void Throw(int bounces) //Lab 2
	{
		for (int i = 1; i < bounces + 1; i++)
		{
			roll = roll + 1 + (int)(Math.random()*6);
			System.out.println(roll); //debugger, makes sure consistent
		}
		roll = roll / bounces;
	}
	
	public void Throw (int dices, int bounces) //Lab 5
	{
		maxSide = maxSide * dices; //multiples the maxSide of dices used to play
		for (int i = 1; i < bounces + 1; i++)
		{
			roll = roll + 1 +(int)(Math.random()*maxSide);
			System.out.println(roll);
		}
		roll = roll / bounces;
	}
	
	public int Value() //Lab 1 return current dice value
	{
		return roll;
	}
	
	public static int OneThrow() //Lab 4
	{
		OneThrow = 1 + (int)(Math.random()*6);
		return OneThrow;
	}
	


}
