package com.List.Vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorDemo {
public static void main(String[] args) {
	List<Integer> lst=Arrays.asList(1,22,3,54,2,7,998,25,4,3,6,58);
	//Vector<Integer> v=new Vector<>(lst);
	Vector<Integer> v1=new Vector<>();
	for(Integer i : lst) {
		if(i%2==0) {
			v1.add(i);
		}
	}
	Collections.sort(v1);
	System.out.println(v1);
	
	System.out.println("---------------------------------");
	
	List<Integer> snd=Arrays.asList(1,22,3,54,2,7,998,25,4,3,6,58);
	List<Integer> res=snd.stream().filter(num-> num%2==0).collect(Collectors.toList());
	System.out.println(res);
	
	
	
//	Vector<Integer> list=new Vector<Integer>();
//	Vector<Object> l1=new Vector<>();
//	list.add(0);
//	list.add(1,15);
//	list.add(12);
//	list.add(35);
//	list.addElement(25);
//
//	l1.add("Helo");
//	l1.add("hi");
//	l1.addAll(2, list);
//	System.out.println(l1.size());
//	
//	System.out.println("Default capacity "+l1.capacity());
//	Object c=l1.clone(); //clone return type is object
//	System.out.println(c.toString());
////	l1.addAll(list);												//Collection
//	System.out.println(l1);
	
	
}
}
