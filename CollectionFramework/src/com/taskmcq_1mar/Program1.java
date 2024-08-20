package com.taskmcq_1mar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(123);
		al.add(543);
		al.add(21);
		al.add(123);
		al.add(321);
		List<Integer> l1=al.stream().distinct().sorted().toList();
		List<Integer> l2=al.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l2);
	}
}
