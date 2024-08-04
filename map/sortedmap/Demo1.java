package com.map.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {

		SortedMap smap=new TreeMap();
		
		smap.put("A", 2000);
		smap.put("B", 4000);
		smap.put("C", 6000);
		smap.put("E", 8000);
		smap.put("D", 10000);
		
		System.out.println(smap);
		
		System.out.println(smap.firstKey());
		System.out.println(smap.lastKey());
		System.out.println(smap.headMap("D"));
		System.out.println(smap.tailMap("C"));
		System.out.println(smap.subMap("B", "E"));
		System.out.println(smap.comparator());
	}

}
/*
Output
A
E
{A=2000, B=4000, C=6000}
{C=6000, D=10000, E=8000}
{B=4000, C=6000, D=10000}
null

*/