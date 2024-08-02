package com.cursor.listiterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {

		LinkedList list=new LinkedList();
		
		System.out.println(list.add("A"));
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		System.out.println(list);
		
		ListIterator itr=list.listIterator();
	/*	while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}*/
		while(itr.hasPrevious())
		{
			String s=(String)itr.previous();
			System.out.println(s);
		}
	}

}
