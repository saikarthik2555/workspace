package com.taskques_2mar;

import java.util.HashSet;
import java.util.List;

record  Employee(Integer id,String name) {
	
}
public class Program1 {
public static void main(String[] args) {
	HashSet<Employee> hs=new HashSet<>();
		hs.add(new Employee(123, "Smith"));
		hs.add(new Employee(234, "Miller"));
		hs.add(new Employee(321, "Ford"));
		hs.add(new Employee(21, "Jack"));
		List<Employee> ls=hs.stream().sorted((e1,e2) ->e1.id()-e2.id()).toList(); 
ls.forEach(t -> System.out.println(t));
}	
}
