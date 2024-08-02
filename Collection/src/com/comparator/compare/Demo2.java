package com.comparator.compare;

import java.util.Comparator;

import java.util.TreeSet;

class MyComp implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
	String s1=(String)obj1;
	String s2=(String)obj2;
		return -s1.compareTo(s2);
	}
	
}
public class Demo2 {

	public static void main(String[] args) {

		//SortedSet ss=new TreeSet();
		TreeSet ts=new TreeSet(new MyComp());
		ts.add("Roshan");
		ts.add("Fatima");
		ts.add("Rakshita");
		ts.add("Gayatri");
		ts.add("Sujeet");
		
		System.out.println(ts);
	}

}
/*
[Sujeet, Roshan, Rakshita, Gayatri, Fatima]

*/