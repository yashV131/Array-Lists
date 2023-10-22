//© A+ Computer Science  -  www.apluscompsci.com
//Name -Yashvi M
//Date -3rd oct
//Class -11
//Lab  -4

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy t = new Toy( "sorry" );
		System.out.println( t );
		
		t = new Toy( "ji goe" );
		t.setCount( 5 );
		System.out.println( t );
	}
}