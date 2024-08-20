package com.stream_methods;

import java.util.Arrays;
import java.util.List;

public class Skip {
	public static void main(String[] args) {
		List<String> c=Arrays.asList("Baja","Sai","Karthik");
		List<String> skipAndLimit =c.stream().skip(1).limit(2).toList();
		skipAndLimit.forEach(t-> System.out.print(t));
	}

}
