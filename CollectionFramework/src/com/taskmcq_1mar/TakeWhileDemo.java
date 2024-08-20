package com.taskmcq_1mar;

import java.util.ArrayList;
import java.util.List;

public class TakeWhileDemo {
	public static void main(String[] args) {
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.add(123);
		all.add(11);	//terminated
		all.add(5);
		all.add(7854);
		all.add(362);
		all.add(236);
		all.add(10);
		List<Integer> l=all.stream().takeWhile(x-> x>=100).toList();
		System.out.println(l);
	}

}
