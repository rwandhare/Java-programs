package com.list.arraylist;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add("A");
		list.add('b');
		list.add(null);
		
		ArrayList list2=new ArrayList();
		list2.add("P");
		list2.add("Q");
		
		System.out.println(list);
		System.out.println(list2);
		//System.out.println(list.get(5));
		//System.out.println(list.indexOf(10));
		//System.out.println(list.lastIndexOf(10));
		//list.remove(4);
		//list.set(4, "C");
		list2.addAll(list);
		System.out.println(list);
		System.out.println(list2);

	}

}

/*  
Output
[10, 20, 30, 40, 10, A, b, null]
[P, Q]
[10, 20, 30, 40, 10, A, b, null]
[P, Q, 10, 20, 30, 40, 10, A, b, null]
 */
 
