package com.map.navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {

		NavigableMap map=new TreeMap();
		
		map.put(101, "A");
		map.put(303, "B");
		map.put(404, "Z");
		map.put(202, "X");
		map.put(505, "D");
		map.put(606, "M");
		
		System.out.println(map);
		System.out.println(map.ceilingKey(406));
		System.out.println(map.higherKey(404));
		System.out.println(map.floorKey(403));
		System.out.println(map.lowerKey(505));
		
		//System.out.println(map.pollFirstEntry());
		//System.out.println(map.pollLastEntry());
		
		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());
	}

}
/*
Output
{101=A, 202=X, 303=B, 404=Z, 505=D, 606=M}
505
505
303
404
[606, 505, 404, 303, 202, 101]
{606=M, 505=D, 404=Z, 303=B, 202=X, 101=A}
*/