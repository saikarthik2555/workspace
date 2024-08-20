package com.Map;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Employee{
	int eid;
	String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}


	@Override
	public boolean equals(Object ob) {
		Employee e2=(Employee) ob;
		if(this.eid==e2.eid && this.ename.equals(e2.ename)) {	
			return true;
		}
		else {
			return false;
		}
	}
//	@Override
//	public boolean equals(Employee obj) {		
//		//we cannot change method paramter of overriden class
//		//But it is possible in generic type
//		//So downCasting needed
//	return false;	
//	}


	public static void main(String[] args) {
		Employee e1=new Employee(101,"Smith");
		Employee e2=new Employee(102,"Miller");
		Employee e3=new Employee(101,"Smith");
		Employee e4=e2;
		HashMap<Employee,String> hm=new HashMap<>();
		hm.put(e1, "Ameerpet");	  //let us assume it is in 3 index
		hm.put(e2, "S R nagar");  //let us assume it is in 5 index
		hm.put(e3, "Begumpet");	  //reference wise false so another inserted in bucket location
		hm.put(e4, "Panjagutta"); //reference wise + content wise same so replace 
		//S R nagar with Panjagutta
		BiConsumer<Employee,String> bc=new BiConsumer<>() {

			@Override
			public void accept(Employee t, String u) {
				System.out.println(t+" "+u);
			}
		};	
		for(int i=0;i<hm.size();i++) {
		bc.accept(e1, "Ameerpet");
		}
		
		hm.forEach((k,v) -> System.out.println(k+" "+v));
	}

}
