package com.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		//return s2.compareTo(s1);
		 return -s1.compareTo(s2);
		
	}
	
}
public class Demo1 {

	public static void main(String[] args) {

		TreeMap tmap=new TreeMap(new MyComparator());
		
		tmap.put("A", 2000);
		tmap.put("B", 4000);
		tmap.put("C", 6000);
		tmap.put("E", 8000);
		tmap.put("D", 10000);
		
		System.out.println(tmap);
		
	}

}

/*
 Output
 
 {E=8000, D=10000, C=6000, B=4000, A=2000}
 */

