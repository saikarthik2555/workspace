package com.HashMap;

import java.util.HashMap;

public class HashMapInternally {
	public static void main(String[] args) {
		Employee e1=new Employee(1, "smith");
		Employee e2=new Employee(2,"ford");
		Employee e3=new Employee(1,"smith");
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e1==e3);
		//System.out.println(e4==e2);
		Employee e4=e2;
		
		HashMap<Employee,String> hm=new HashMap<Employee,String>();
		hm.put(e1, "Hyderabad");
		hm.put(e2, "Secunderabad");
		hm.put(e3, "Panjagutta");
		hm.put(e4, "Koti");
		hm.forEach((emp,place)-> System.out.println(emp+"   "+place));
		
	}

}
class Employee{
	private int id;
	private String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e2=(Employee)obj;
			if(this.id==e2.id&& this.name.equals(e2.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			System.out.println("Cannot compare");
			return true;
		}
	}
}