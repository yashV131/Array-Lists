//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
		Word obj = new Word("chicken");
		out.println(obj);
		out.println("num vowels == "+obj.getNumVowels());
		out.println("num chars ==" + obj.getLength());

		Word obj2 = new Word("AlLigAtoR");
		out.println(obj2);
		out.println("num vowels == "+obj2.getNumVowels());
		out.println("num chars ==" + obj2.getLength());

		Word obj3 = new Word("ElEpHanT");
		out.println(obj3);
		out.println("num vowels == "+obj3.getNumVowels());
		out.println("num chars ==" + obj3.getLength());
	}
}