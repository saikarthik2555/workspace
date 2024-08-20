package com.treemap;


import java.util.TreeMap;
class Employee11 {
	private Integer id;
	private String name;
	public Employee11(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee11 [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
public class NavigableDemo {
	public static void main(String[] args) {
		TreeMap<Employee11,Double> tm=new TreeMap<Employee11,Double>((emp1,emp2)-> emp1.getId()-emp2.getId());
		tm.put(new Employee11(123, "Smith"), 20000d);
		tm.put(new Employee11(526, "Miller"), 22000d);
		tm.put(new Employee11(425, "Ford"), 23000d);
		tm.put(new Employee11(223, "Jack"), 25000d);
		tm.forEach((k,v)-> System.out.println(k+" "+v));
	}
}
