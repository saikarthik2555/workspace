package com.taskmcq_29feb;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program1 {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,2,3,1);
		Set<Integer> l=lst.stream().distinct().collect(Collectors.toSet());
		System.out.println(l.size()==lst.size());
		
//		LinkedHashSet<Integer> lm=new LinkedHashSet<Integer>(lst);
//		System.out.println(lst.size()==lm.size());
	}

}
