package com.july.practise.hierarchical;

import com.practise.Just;

public class Elc extends Just{
	public static void main(String []i) {
		 
		Employee1 emp1=new Employee1(12000d);
		System.out.println(emp1);
		
//		Just j=new Just();						//deault
//		System.out.println(j.getNumber());
		
//		Elc e=new Elc();							//protected 
//		System.out.println(e.number);
		
		//String name=Just.name;			//public static 
		//Just.getName();				//default static		
		
		//int n=new Elc().number;
		
//		Just j=new Just();
//		j.getSal();
		
//		Just j=new Just();
//		System.out.println(j.c);
//		j.getLength();
				
		Elc e=new Elc();
		System.out.println(e);
		
	}

	@Override
	public String toString() {
		return "Elc [number=" + number + ", c=" + c + ", length=" + length + "]";
	}
	
}
