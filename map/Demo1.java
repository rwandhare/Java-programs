package com.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {

		Map map=new HashMap();
		
		map.put(101, "Roshan");
		map.put(202, "Aiman");
		map.put(303, "Gayatri");
		map.put(404, "Shouryash");
		
		Map map2=new HashMap();
		map2.put(505, "Sujeet");
		map2.put(606, "Rakshita");
		
		System.out.println(map);
		System.out.println(map2);
		
		map2.putAll(map);
		
		System.out.println(map2);
		
	}
	
}
/*
	Output
{404=Shouryash, 101=Roshan, 202=Aiman, 303=Gayatri}
{505=Sujeet, 606=Rakshita}
{404=Shouryash, 101=Roshan, 505=Sujeet, 202=Aiman, 606=Rakshita, 303=Gayatri}

	*/