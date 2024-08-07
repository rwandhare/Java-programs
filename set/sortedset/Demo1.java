package com.set.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {

		//SortedSet ss2=new TreeSet();
		SortedSet ss=new TreeSet();
		ss.add("A");
		ss.add("E");
		ss.add("F");
		ss.add("E");
		ss.add("C");
		ss.add("B");
		//ss.add(null);
		//ss.add(10);
		
		//ss2.add(null);
		System.out.println(ss);
		//System.out.println(ss2);
		
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet("E"));
		System.out.println(ss.tailSet("C"));
		System.out.println(ss.subSet("B", "F"));
		System.out.println(ss.comparator());
		
		
	}

}
/*
Output
[A, B, C, E, F]
A
F
[A, B, C]
[C, E, F]
[B, C, E]
null
*/