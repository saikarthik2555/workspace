package com.stream_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Shopping {
	public static void main(String[] args) {
		List<String> p1=Arrays.asList("Bottle","Pens","Books");
		List<String> p2=Arrays.asList("Camera","Clothes");
		List<Product> p=Arrays.asList(new Product(123, p1),new Product(345, p2));
		List<String> totalProducts=p.stream().flatMap(t-> t.getListOfProducts().stream()).collect(Collectors.toList());
		totalProducts.forEach(t-> System.out.print(t+" "));
	}
}