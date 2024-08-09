package com.practise.problems;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {

		Employee employee1=new Employee();
		employee1.setId(101);
		employee1.setName("Gayatri");
		employee1.setSalary(50000);
		
		Employee employee2=new Employee(202,"Rakshita",40000);
		Employee employee3=new Employee(303,"Aiman",30000);
		
		Student student1=new Student(111, "Roshan", 70);
		Student student2=new Student(222, "Sujeet", 80);
		
		TreeSet ts=new TreeSet();
		ts.add(employee1);
		ts.add(employee2);
		ts.add(employee3);
		
		
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
