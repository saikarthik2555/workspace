package com.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MapMethod {
	public static void main(String[] args) {
	List<String> l1=Arrays.asList("Sunday","Monday","Tuesday");
	List<String> l2=Arrays.asList("Wednesday","Thursday","Friday");
	List<String> l3=Arrays.asList("Saturday");
		List<List<String>> coll=Arrays.asList(l1,l2,l3);
		List<String> collecti=coll.stream().flatMap(str-> str.stream()).collect(Collectors.toList());
		System.out.println(collecti);
		collecti.forEach(t->System.out.println(t));
	}
}
