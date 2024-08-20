package com.Has_a_aggregation;

public class Elc {
	public static void main(String[] args) {
		Organisation wipro=new Organisation(123, "wipro", "Gowlidoddi");
		Employee emp1=new Employee(122, "Sai Karthik",wipro);
		System.out.println(emp1);
//		Employee emp2=new Employee(123, "Smith", "Oracle");
//		System.out.println(emp2);
		Organisation org=new Organisation(334, "tcs", "ravirala");
		System.out.println(org);           //weak reference
		
		
		System.out.println(new Employee(122,"sai Karthik",new Organisation(123,"wipro","Gowlidoddi")));
		//Annonomous reference variable
		//Annonomous object creation
	}

}
