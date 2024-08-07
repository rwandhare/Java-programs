package com.set.hashset;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add(null);
		hs.add(10);
		hs.add(20);
		hs.add("E");
		//hs.add(null);
		
		System.out.println(hs);
		
	}

}
/*
Output
[null, A, B, C, D, 20, E, 10]
*/
