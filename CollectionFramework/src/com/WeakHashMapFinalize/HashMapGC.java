package com.WeakHashMapFinalize;

import java.util.HashMap;

class Employee1{
	int id;
	String name;
	public Employee1(int id, String name) {
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
		Employee1 other = (Employee1) obj;
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
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void finalize() {
		System.out.println("If eligible for GC this method will invoke ");
	}
	
}
public class HashMapGC {
	
	public static void main(String[] args) throws InterruptedException {
		HashMap<Employee1,Double> wm=new HashMap<>();
		wm.put(new Employee1(1, "Smith"), 12000d);
		wm.put(new Employee1(2, "Miller"), 14000d);
		wm.put(new Employee1(1, "Smith"), 15000d);
		Employee1 e1=new Employee1(4, "Ford");
		wm.put(e1, 18000d);
		e1=null;
		System.gc();
		Thread.sleep(4000);
		wm.forEach((k,v)-> System.out.println(k+" "+v));
		
	}

}
