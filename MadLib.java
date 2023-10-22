//© A+ Computer Science  -  www.apluscompsci.com
//Name -Yashvi M
//Date -3rd oct
//Class - 11
//Lab  -5

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;

	private String madlib;

	public MadLib()
	{
		verbs =new ArrayList<>();
		nouns =new ArrayList<>();
		adjectives =new ArrayList<>();

	}

	public MadLib(String fileName)
	{
		verbs =new ArrayList<>();
		nouns =new ArrayList<>();
		adjectives =new ArrayList<>();
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File(fileName));
			madlib="";
			while(file.hasNext()){
				String s=file.next();
				if(s.equals("#")){
					madlib +=getRandomNoun();
				}
				else if(s.equals("@")){
					madlib +=getRandomVerb();
				}
				else if(s.equals("&")){
					madlib +=getRandomAdjective();
				}
				else{
					madlib+=s;
				}
				madlib+=" ";

			}

		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
			e.printStackTrace();
		}

	}

	public void loadNouns()
	{
		nouns =new ArrayList<>();
		try{
			Scanner file = new Scanner(new File("D:\\projects\\CS 2\\Semester 1\\Week 6 Array List\\ArrayLists\\src\\nouns.dat"));
			while(file.hasNext()){
				nouns.add(file.next());
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public void loadVerbs()
	{
		verbs =new ArrayList<>();
		try{
			Scanner file = new Scanner(new File("D:\\projects\\CS 2\\Semester 1\\Week 6 Array List\\ArrayLists\\src\\verbs.dat"));
			while(file.hasNext()){
				verbs.add(file.next());
			}




		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void loadAdjectives()
	{
		adjectives =new ArrayList<>();
		try{
			Scanner file = new Scanner(new File("D:\\projects\\CS 2\\Semester 1\\Week 6 Array List\\ArrayLists\\src\\adjectives.dat"));
			while (file.hasNext()){
				adjectives.add(file.next());
			}



		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getRandomVerb()
	{
		int rand =(int) (Math.random()* verbs.size());
		return verbs.get(rand);
	}

	public String getRandomNoun()
	{
		int rand =(int) (Math.random()* nouns.size());
		return nouns.get(rand);
	}

	public String getRandomAdjective()
	{
		int rand =(int) (Math.random()* adjectives.size());
		return adjectives.get(rand);
	}

	public String toString()
	{
		return madlib;
	}
}