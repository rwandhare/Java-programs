package com.list.vector;

import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {

		Vector v=new Vector();
		System.out.println(v.capacity()); // 10
		
		for(int i=1;i<=20;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		System.out.println(v.capacity()); // 20
		
		v.addElement(21);
		
		System.out.println(v);
		System.out.println(v.capacity()); //40
	}

}
/*
 10
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
20
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]
40
*/
