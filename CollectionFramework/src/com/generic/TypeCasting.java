package com.generic;

import java.util.ArrayList;

public class TypeCasting {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(17);
		al.add(56);
		al.add(39);
		al.add(90);
		for(int i=0;i<al.size();i++) {
			Integer num= (Integer)al.get(i);
			System.out.println(num);
		}
		}
}
