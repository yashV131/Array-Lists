//? A+ Computer Science  -  www.apluscompsci.com
//Name -Yashvi
//Date -3rd oct
//Class -11
//Lab  -4

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		test.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		out.println(test);
		out.println("max ==" +test.getMostFrequentToy());
	}
}