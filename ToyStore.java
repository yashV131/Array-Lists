//© A+ Computer Science  -  www.apluscompsci.com
//Name -Yashvi m
//Date -3rd oct
//Class -11
//Lab  -4

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList= new ArrayList<>();
	}

	public void loadToys( String toys )
	{
		toyList= new ArrayList<>();
		ArrayList<String>list = new ArrayList<>();
		Scanner chop = new Scanner(toys);
		while(chop.hasNext()){
			list.add(chop.next());
		}
		for(int i=0;i<list.size();i++){
			String name=list.get(i);
			Toy t = getThatToy(name);
			if(t==null){
				toyList.add(new Toy(name));
			}
			else{
				int num=0;
				for(Toy x : toyList){
					if(x.getName().equals(name)){
						toyList.get(num).setCount(toyList.get(num).getCount()+1);
					}
					num++;
				}
			}

		}
	}

	public Toy getThatToy( String nm )
	{
		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;

	}

	public String getMostFrequentToy()
	{
		String name = "";
		int max = 0;
		for(Toy x: toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}


	public void sortToysByCount()
	{
		int n = toyList.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Toy toy1 = toyList.get(j);
				Toy toy2 = toyList.get(j + 1);

				if (toy1.getCount() > toy2.getCount()) {
					// Swap toy1 and toy2 in the list
					toyList.set(j, toy2);
					toyList.set(j + 1, toy1);
				}
			}
		}
	}

	public String toString()
	{
		sortToysByCount();
		return ""+toyList;
	}
}


