package com.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lm=new LinkedHashMap<Integer,String>();
		lm.put(1, "Abc");
		lm.put(2, "der");
		lm.put(3, "qwed");
		lm.put(4, "xyz");
		lm.put(3, "erd");
		lm.put(5, "null");
		lm.put(5, null);
		System.out.println(lm);			//stores in Order
		/*o/p
		 * {1=Abc}
		 * {2=der}
		 * {3=erd}
		 * {4=xyz}
		 * 
		 * 
			*/
	}

}
