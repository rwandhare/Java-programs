package com.map.hashtable;

import java.util.Hashtable;

class Temp
{
	int i;
	public Temp(int i) 
	{
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i%9;
	}
	@Override
	public String toString() {
		return i+"";
	}
}
public class Demo2 {

	
	public static void main(String[] args) {

		Hashtable h=new Hashtable();
		
		h.put(new Temp(13),"A");
		h.put(new Temp(9), "B");
		h.put(new Temp(18), "C");
		h.put(new Temp(2), "D");
		h.put(new Temp(7), "E");
		h.put(new Temp(31), "F");
		h.put(new Temp(17), "G");
		
		// F,B,C,E,G,D,A
		// F B E C G D A
		//31,9,18,17,7,13,		
		System.out.println(h);
	}

}

/*
Output
 {17=G, 7=E, 31=F, 13=A, 2=D, 18=C, 9=B}
 */
