package com.prg.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDetails {
	public static void main(String[] args) {
		List<Optional<Employee>> emp=new ArrayList<Optional<Employee>>();
		emp.add(Optional.ofNullable(new Employee(12, "Smith")));
		emp.add(Optional.ofNullable(null));
		emp.add(Optional.ofNullable(new Employee(56, "Bruce")));
		
		for(Optional<Employee> e:emp) {
			if(e.isPresent()) {
				System.out.println(e.get());
			}else {
				System.out.println("No value");
			}
		}
	}

}
