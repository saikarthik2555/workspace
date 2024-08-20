package com.wildcard;

record Student(Integer id,String name) {
	
}

public class WildCardDemo<T> {
	T value;
	public WildCardDemo(T value) {
		this.value=value;
	}
	public T getValue() {
		return value;
	}
	public static void main(String[] args) {
		Integer i=15;
		WildCardDemo<Integer> i1= new WildCardDemo<>(i);
		System.out.println(i1.getValue());
		
		WildCardDemo<Student> stu=new WildCardDemo<>(new Student(12, "Smith"));
		System.out.println(stu.getValue());	
	}

}
