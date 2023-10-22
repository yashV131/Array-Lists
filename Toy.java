//? A+ Computer Science  -  www.apluscompsci.com
//Name - Yashvi M
//Date -3rd Oct
//Class -11
//Lab  -4

import static java.lang.System.*;
public class Toy
{
	private String name;
	private int count;


	public Toy()
	{
		name="";
		count=1;
	}

	public Toy( String nm )
	{
		name=nm;
		count=1;
	}

	public int getCount()
	{
		return count;
	}
	public void setCount( int cnt )
	{
		count=cnt;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String nm )
	{
		name=nm;
	}

	public String toString()
	{
		return name+" "+count;
	}
}