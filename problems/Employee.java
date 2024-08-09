package com.practise.problems;

public class Employee{
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	
	}

@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

}

/*
Output
[10, 20, 30, 20, 40, 20, 10, 50, 30, 60]
.............................
After Duplicate Removal
[10, 20, 30, 40, 50, 60]
Array List
[10, 20, 30, 40, 50, 60]
*/