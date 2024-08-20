package com.july.practise.hierarchical;

public class Employee1 extends Company{
	public Employee1(Double sal) {
		this.salary=sal;
		}

	@Override
	public String toString() {
		return "Employee1 [salary=" + salary + "]";
	}
	

}
