package com.map.hashtable;

import java.util.Hashtable;

public class Demo1 {

	public static void main(String[] args) {

		Hashtable htable=new Hashtable();
		
		htable.put(5, "A");
		htable.put(2, "B");
		htable.put(6, "C");
		htable.put(15, "D");
		htable.put(23, "E");
		htable.put(16, "F");
		
		System.out.println(htable);
	}

}
/*

Output
{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
*/