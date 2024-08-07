package com.set.sortedset;

import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		Integer i1=new Integer(30);
		ts.add(10);
		ts.add(0);
		ts.add(i1);
		ts.add(15);
		ts.add(8);
		System.out.println(ts);
		
		
	}

}
/*
Output
[0, 8, 10, 15, 30]

*/