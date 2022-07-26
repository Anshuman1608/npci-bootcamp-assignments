package practice.list;

import java.util.Set;
import java.util.TreeSet;

public class SimilarSets {
	public static void main(String[] args) {
		Set<Integer> firstSet = new TreeSet<Integer>();
		firstSet.add(1);
		firstSet.add(4);
		firstSet.add(3);
		firstSet.add(7);
		firstSet.add(12);
		
		
		Set<Integer> secondSet = new TreeSet<Integer>();
		secondSet.add(1);
		secondSet.add(3);
		secondSet.add(7);
		secondSet.add(9);
		secondSet.add(12);
		
		firstSet.retainAll(secondSet);
		System.out.println(firstSet);
	}

}
