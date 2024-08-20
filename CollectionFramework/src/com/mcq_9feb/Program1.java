package com.mcq_9feb;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(4);				//capacity
		v.addElement(new Integer(5));  //depresiation
		v.addElement(3);
		v.addElement(2);
		System.out.println(v);
		System.out.println(v.capacity());
	}

}
