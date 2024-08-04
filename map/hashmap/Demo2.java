package com.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList values=new ArrayList();
		values.add(101);
		values.add(202);
		values.add(303);
		values.add(404);
		values.add(303);
		
	//	System.out.println(values);
		
		Set keys=new HashSet();
		keys.add("A");
		keys.add("B");
		keys.add("C");
		keys.add("D");
		
	//	System.out.println(keys);
		
		HashMap hmap=new HashMap();
		//hmap.put(keys, values);
		hmap.put(values, keys);
	
		
		System.out.println(hmap);
		
	}

}
/*
Output
{[101, 202, 303, 404, 303]=[A, B, C, D]}
*/