package com.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

record Employee(int id,String name) implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.name.compareTo(e2.name);
	}
	
}
public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Employee,Double> t1=new TreeMap<Employee,Double>((e1,e2)-> e1.id()-e2.id());
		//Comparator 
		//public int compare<T,T>
		t1.put(new Employee(321, "smith"), 25000d);
		t1.put(new Employee(654, "miller"), 27000d);
		t1.put(new Employee(985,"ford"), 24000d);
		t1.put(new Employee(210, "jack"), 19000d);
		t1.forEach((k,v)-> System.out.println(k+" "+v));
		System.out.println("====================================");
		TreeMap<Employee,Double> t2=new TreeMap<>((e1,e2)-> e1.name().compareTo(e2.name()));
		t2.put(new Employee(321, "smith"), 25000d);
		t2.put(new Employee(654, "miller"), 27000d);
		t2.put(new Employee(985,"ford"), 24000d);
		t2.put(new Employee(210, "jack"), 19000d);
		t2.forEach((k,v)-> System.out.println(k+" "+v));
	}

}
