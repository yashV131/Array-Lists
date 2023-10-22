//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "aeiou";   //only one

	public Word()
	{
		word = "";
	}
	public Word(String wrd)
	{
		word = wrd;
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
		word= word.toLowerCase();
		for(int i =0;i<word.length();i++)
		{
			char ch = word.charAt(i);
			for(int j= 0;j<vowels.length();j++)
			{
				char chVowel = vowels.charAt(j);
				if(ch == chVowel){
					count++;
				}
			}
		}
		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}