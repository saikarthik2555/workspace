package com.optional_prg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		Optional<String> na=Optional.ofNullable(null);	//Exception - not accept null
		
		List<Optional<Student>> stu=new ArrayList<>();
		stu.add(Optional.ofNullable(new Student(12, null)));
		System.out.println(stu.get(0).get());
							//List(int index) 
	}
}
