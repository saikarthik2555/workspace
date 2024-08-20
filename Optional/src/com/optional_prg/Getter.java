package com.optional_prg;

import java.util.Optional;

public class Getter {
	public static void main(String[] args) {
		Employee e=new Employee(0,null);
		Optional<Integer> id = e.getId();
		if(id.isEmpty()) {
			System.out.println("Empty Id");
		}else {
			System.out.println("The id "+id.get());
		}
		Optional<String> name = e.getName();		
		if(name.isPresent()) {
			System.out.println(name.get());
		}else {
			System.out.println("No Name");
		}
		System.out.println(id+" "+name);
		
	}

}
