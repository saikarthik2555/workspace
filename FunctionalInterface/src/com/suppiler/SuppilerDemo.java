package com.suppiler;

import java.util.function.Supplier;

public class SuppilerDemo {
public static void main(String[] args) {
//	public T get();
	Supplier<Employee> emp1=()->{									//lambda approach
		Employee e=new Employee(12, "sai karthik", 42000d);		//without in this approach we cannot impement
		return e;												//Supplier interface
	};
	System.out.println(emp1.get());
//	Supplier<Employee> emp=new Supplier<Employee>() {		//anonymous approach
//
//		@Override
//		public Employee get() {
//			return new Employee(12,"sai karthik",40000d);
//		}
//	};
//	System.out.println(emp.get());
	}
}
class Employee {
	private Integer id;
	private String name;
	private Double salary;
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}