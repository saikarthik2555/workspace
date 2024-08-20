package com.List.Vector;

import java.util.Vector;

public class CapacityDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(100,10);
		for(int i=0;i<100;++i) {
			v.add(i);
		}
		System.out.println(v.capacity());
		v.add(101);
		System.out.println(v.capacity());	//110
		
		for(Integer i:v) {
			System.out.print(i+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}
	}

}
