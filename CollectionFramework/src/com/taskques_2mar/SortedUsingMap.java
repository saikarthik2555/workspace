package com.taskques_2mar;

import java.util.List;
import java.util.TreeSet;
record Employee1(Integer id, String name,Double salary) {
	
}
public class SortedUsingMap {
	public static void main(String[] args) {
		TreeSet<Employee1> ts=new TreeSet<>((e1,e2)-> e1.salary().compareTo(e2.salary()));
		ts.add(new Employee1(523, "Miller", 27000d));
		ts.add(new Employee1(21, "Ford", 30000d));
		ts.add(new Employee1(212, "Smith", 20000d));
		ts.add(new Employee1(754, "Jack", 32000d));
		ts.add(new Employee1(32, "John", 31000d));
		List<Employee1> ls=ts.stream().filter(sal -> sal.salary()>=30000.0).toList();
		ls.forEach(emp -> System.out.println(emp));
	}
}
