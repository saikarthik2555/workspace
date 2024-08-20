package com.consumer_interface;
import com.functional_interface.*;		//go to this package
//import java.util.function.Consumer;		
public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> strType=str -> System.out.println(str);
		strType.accept("KarthiK");			
		
		Consumer<Integer> intType=str -> System.out.println(str);
		intType.accept(77);				
		
		Consumer<Student> stuType=stu -> System.out.println(stu);  
		stuType.accept(new Student(111,"don"));
	}

}
