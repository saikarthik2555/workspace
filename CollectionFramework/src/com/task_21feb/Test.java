package com.task_21feb;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Set<Apple> s=new TreeSet<>();
		s.add(new Apple(12));
		s.add(new Apple(23));
		s.add(new Apple(34));
		Comparator<Apple> cmpid=new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
			return o1.getId()-o2.getId();
			}
		};
		s.forEach(t-> System.out.println(t));
	}
}