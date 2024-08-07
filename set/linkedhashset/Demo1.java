package com.set.linkedhashset;

import java.util.LinkedHashSet;

public class Demo1 {

	public static void main(String[] args) {

		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add(10);
		lhs.add(20);
		lhs.add("E");
		
		System.out.println(lhs);
	}

}
/*
Output
[A, B, C, D, 10, 20, E]
		*/