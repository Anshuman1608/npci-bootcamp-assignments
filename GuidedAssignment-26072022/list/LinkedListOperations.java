package practice.list;

import java.util.LinkedList;

public class LinkedListOperations {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(19);
		list.add(21);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(55);
		list2.add(99);
		list2.add(21);
		//addAll()
		list.addAll(list2);
		System.out.println(list);
		//addFirst()
		list.addFirst(12);
		System.out.println("addFirst(12) = " + list);
		//addLast()
		list.addLast(00);
		System.out.println("addLast(00) = " + list);
		//indexOf
		System.out.println("indexOf(19) = " + list.indexOf(19));
		//lastIndexOf
		System.out.println("lastIndexOf(21) = " + list.lastIndexOf(21));
		//peekFirst()
		System.out.println("peekFirst() = " + list.peekFirst());
		//peekLast()
		System.out.println("peekLast() = " + list.peekLast());
		//pollFirst
		list.pollFirst();
		System.out.println("list.pollFirst() = " + list);
		//pollLast
		list.pollLast();
		System.out.println("list.pollLast() = " + list);
		//size
		System.out.println("size of list = " + list.size());
	}

}
