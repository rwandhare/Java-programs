package com.list.linkedlist;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {

		LinkedList list=new LinkedList();
		
		list.add("A");
		list.add(10);
		list.add(20);
		list.add("B");
		list.add(null);
		System.out.println(list);
		//list.set(3, 40);
		list.addFirst("Z");
		System.out.println(list);
		list.addFirst("C");
		//list.addLast("U");
		//list.removeFirst();
		//list.removeLast();
		System.out.println(list);
	}

}
/*
[A, 10, 20, B, null]
[Z, A, 10, 20, B, null]
[C, Z, A, 10, 20, B, null]
*/