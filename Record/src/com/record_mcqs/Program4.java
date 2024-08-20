package com.record_mcqs;
record Employee(String str,String name) {
	public Employee(String name) {
		this("0",null);
	}
}
public class Program4 {
	public static void main(String[] args) {
		Employee emp=new Employee("hajs");
		
		System.out.println(emp);
	}

}
