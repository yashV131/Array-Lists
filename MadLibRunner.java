	//� A+ Computer Science  -  www.apluscompsci.com
//Name -Yashvi M
//Date -3rd oct
//Class - 11
//Lab  -5

import java.io.FileNotFoundException;

import static java.lang.System.*;

public class MadLibRunner
{
	public static void main( String args[] ) throws FileNotFoundException {
		//make a new MadLib
		MadLib test = new MadLib("D:\\projects\\CS 2\\Semester 1\\Week 6 Array List\\ArrayLists\\src\\story.dat");
		out.println(test);
		out.println("\n");
	}
}