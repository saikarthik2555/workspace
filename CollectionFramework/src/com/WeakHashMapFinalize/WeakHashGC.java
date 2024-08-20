package com.WeakHashMapFinalize;

import java.util.WeakHashMap;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public void finalize() {
		System.out.println("invoked");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
public class WeakHashGC {
	public static void main(String[] args) {
		WeakHashMap<Employee,Double> wm=new WeakHashMap<>();
		Employee e1=new Employee(1, "Smith");
		wm.put(e1, 12000d);
		
		Employee e2=new Employee(2, "Miller");
		wm.put(e2, 14000d);
		
		Employee e3=new Employee(1, "Smith");
		wm.put(e3, 15000d);
		
		Employee e4=new Employee(4, "Ford");
		wm.put(e4, 18000d);
		
		e4=null;
		System.gc();
		System.out.println(wm);
	}

}
