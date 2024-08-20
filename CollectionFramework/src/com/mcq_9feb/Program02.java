package com.mcq_9feb;
import java.util.Vector;
public class Program02 {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(12);
		v.addElement(17);
		v.addElement(21);
		//v.set(2, 100);//to replace
		v.insertElementAt(100, 2);   //obj,index
		v.set(3, 77);		//public object set(index,obj);
		v.setElementAt(2222, 1);  //public object setElementAt(obj,index);
		v.removeAll(v);
		System.out.println(v.isEmpty());
		System.out.println(v);
	}

}
