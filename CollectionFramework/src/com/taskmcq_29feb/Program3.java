package com.taskmcq_29feb;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

record Employee(Integer age,String name,Double salary) {

}

public class Program3 {
	public static void main(String[] args) {
		List<Employee> lm=Arrays.asList((new Employee(21, "Smith", 20000d)),(new Employee(27,"Miller",25000d)),(new Employee(35, "Ford", 30000d)));
		Set<Employee> s=lm.stream().filter(e -> e.age()>25).collect(Collectors.toSet());
//		forEach(Employee emp: s){
//			emp.salary()+=(double)emp.salary()*0.1;
//		}
		System.out.println(s);
	}
}
