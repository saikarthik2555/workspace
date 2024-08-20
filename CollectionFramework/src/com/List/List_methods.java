package com.List;
import java.util.List;
import java.util.Vector;

public class List_methods{
	public static void main(String[] args) {
		
		List<Object> v=new Vector<>();
		//System.out.println(v.capacity());
		v.add("Zero");						//from collection
		v.add("First");
		v.add(2, "Second");//from List   return type -->void
		System.out.println(v);
		v.addAll(1,v);
		System.out.println(v);
		v.remove("Zero");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		System.out.println(v.indexOf("Second"));
	//	System.out.println(v.lastElement());
		System.out.println(v.indexOf("Second"));
		System.out.println(v.lastIndexOf("Second"));
		String a=(String) v.get(2);
		System.out.println(v);
		v.add(12);
		v.add(45);
		List_methods c=new List_methods();
		int b=(int)v.get(4);	
		
//		ArrayList<Object> al = new ArrayList<>(); //Generic type
//		al.add(12);
//		al.add("Ravi");
//		al.add(12);		
//		al.add(3,"Hyderabad"); //add(int index, Object o)method of List interface
//		al.add(1,"Naresh");
//		al.add(null);
//		al.add(11);
//		System.out.println(al);

	}
}
