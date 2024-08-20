package com.practise;

public class StaticExecution {

	public static void main(String[] args) {
		Integer i=Integer.valueOf("5");//instance variable
		Employee1 e1=new Employee1();				//creating obj in Heap
		getEmployee(e1);					//calling static ()	
		System.out.println(i);
	}
	public static void getEmployee(Employee1 e) {	//reference
		e.getEmployeeName();	

		}
}
class Employee1{
	int a;
	Integer i1=Integer.parseInt("5");//instance variable
	
	String name="ravi";					//Heap area
	public Employee1() {
	int m=i1.MAX_VALUE;
	}
	public void getEmployeeName() {
		System.out.println(a);
		hello();
		System.out.println(name);
	}
	public void hello() {
		System.out.println("hello method ater this name will print");
	}
}