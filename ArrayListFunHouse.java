//� A+ Computer Science  -  www.apluscompsci.com
//Name -Yashvi M
//Date -3rd oct
//Class -11
//Lab  - 1

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	/*
	 *method getListOfFactors will return a list of 
	 *all of the factors of number - excluding number
	 */
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList <Integer> nums = new ArrayList<>();
		for(int i =1;i<number;i++)
		{
			if(number%i == 0)
				nums.add(i);
		}
		return nums;
	}
}