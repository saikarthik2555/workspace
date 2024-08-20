package com.optional_prg;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String str="abcdefghij";
		Optional<String> op= Optional.ofNullable(str);
		//Container object created
		String els=op.orElse("Container is empty");
		System.out.println(els);
		
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		else {
			System.out.println("No value");
		}
	}

}
