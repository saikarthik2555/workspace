package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
record Employee(Integer id,String name) {
	
}
public class Sample1 {
	public static void main(String[] args) {
//		List<Employee> l=new ArrayList<Employee>();
//		l.add(new Employee(124, "Smith"));
//		l.add(new Employee(321,"Miller"));
//		l.add(new Employee(25, "Jack"));
//		l.add(new Employee(2, "Ford"));
		//l.sort((e1,e2)-> e1.name().compareTo(e2.name()));
//		List<Integer> l=new ArrayList<Integer>();
//		l.add(52);
//		l.add(2);
//		l.add(0);
//		l.add(852);
//		l.add(23);
//		l.sort((i1,i2)-> i1-i2);
		 List<String> listOfName = Arrays.asList("Rohit","Akshar","Pallavi","Sweta"); 
		 listOfName.sort((n1,n2)-> n1.compareTo(n2));
		ArrayList<Float> a=new ArrayList<>();
		System.out.println(listOfName);
	
	}

}
