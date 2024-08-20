package com.generic;

import java.util.ArrayList;

public class GenWithRawType {
	public static void main(String[] args) {
		ArrayList<Car> c=new ArrayList<Car>();
		c.add(new Car());
		c.add(new Car());
		c.add(new Car());
		c.add(new Car());
		ArrayList<Car> a=c;
		System.out.println(a);
	}
}
class Car{
	
}
