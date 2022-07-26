package practice.list;

import java.util.ArrayList;
import java.util.Arrays;

public class DescribingList {
	public static void main(String[] args) {
		ArrayList<String> randomlist = new ArrayList<String>();
		
		randomlist.add("C");
		randomlist.add("C++");
		randomlist.add("Java");
		randomlist.add("Python");
		
		System.out.println("ArrayList isEmpty: " + isEmpty(randomlist));
		
		int i = 0;
		for(String str : randomlist)
		{
			System.out.println("ArrayList at index " + i + " is : " + str);
			i++;
		}
		
		randomlist.set(findIndex(randomlist), "Python3");
		System.out.println("ArrayList after changes : " + randomlist);
		
		ArrayList<String> appendlist = new ArrayList<String>();
		appendlist.add("R");
		appendlist.add("MySQL");
		appendlist.add("save");
		appendlist.add("vase");
		
		randomlist.addAll(appendlist);
		System.out.println("After appending the List  : " + randomlist);
		
		
		
		for(int j = 1; j < randomlist.size(); j++)
		{
			for(int k = j+1; k < randomlist.size();k++)
			{
				findAnagrams(randomlist.get(j),randomlist.get(k));
			}
		}
		
		
		
		
	}
	
	
	public static Boolean isEmpty(ArrayList<String> randomlist)
	{
		if(randomlist.size()==0)
			return true;
		return false;
	}
	
	public static int findIndex(ArrayList<String> randomlist)
	{
		int index = randomlist.indexOf("Python");
		return index;
	}
	
	public static void findAnagrams(String txt1, String txt2)
	{
		
		char[] character1 = txt1.toCharArray();
		char[] characters2 = txt2.toCharArray();
		Arrays.sort(character1);
		Arrays.sort(characters2);
		if (Arrays.equals(character1, characters2))
		{
           	 System.out.println(txt1+" "+txt2);
           
		}
               
		
	}

}
