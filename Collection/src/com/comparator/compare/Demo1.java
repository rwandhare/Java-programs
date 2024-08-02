package com.comparator.compare;

import java.util.Comparator;
import java.util.TreeSet;

class A implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) 
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -10;
		}
		else
		{
			return 0;
		}
	}
	
}

public class Demo1 {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new A());
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(8);
		System.out.println(ts);
		System.out.println(ts.comparator());
		
		

	}

}

/* output
[15, 10, 8, 0]
com.comparator.compare.A@79fc0f2f
*/
