package com.list.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		System.out.println(list.size());
		System.out.println(list);
		
		
	}

}
/*
5
[10, 20, 30, 40, 10]
*/