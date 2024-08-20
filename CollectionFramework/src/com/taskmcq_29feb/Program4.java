package com.taskmcq_29feb;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.stream.Collectors;

class Employe{
	private String name;
	private String department;
	private double salary;
	public Employe(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}

public class Program4 {
	public static void main(String[] args) {
	
		LinkedHashSet<Employe> lst=new LinkedHashSet<Employe>();
		lst.add(new Employe("Smith", "Testing",15000 ));
		lst.add(new Employe("Ford", "Java Developer", 25000));
		lst.add(new Employe("Miller", "HR", 27000));
		lst.add(new Employe("James", "Testing", 160000));
		lst.add(new Employe("Max", "Java Developer", 30000));
		Optional<Employee> l=lst.stream().filter(e-> e.getDepartment().equals("Java Developer")).collect(Collectors.maxBy(Comparator.comparing(Employe::getSalary)));
		System.out.println(l);
	}

}
