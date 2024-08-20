package com.taskmcq_1mar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Max {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(127);
		lst.add(654);
		lst.add(212);
		lst.add(879);
		lst.add(990);
		lst.add(21);
		//Optional<Integer> m1=lst.stream().max((a,b)-> a.compareTo(b));
		Optional<Integer> m2=lst.stream().max((a,b)-> a-b);
		System.out.println(m2);
	}

}
