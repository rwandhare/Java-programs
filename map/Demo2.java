package com.map;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {

		Map map=new HashMap();
		map.put(101, "A");
		map.put(202, "B");
		map.put(303, "C");
		map.put(404, "A");
		
		System.out.println(map);
	}

}
/*Output
{404=A, 101=A, 202=B, 303=C}
*/