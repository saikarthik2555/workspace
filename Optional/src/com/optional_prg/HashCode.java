package com.optional_prg;

import java.util.Optional;

public class HashCode {
	public static void main(String[] args) {
		Optional<String> op1=Optional.ofNullable(null);
		System.out.println(op1);
		
		Optional<String> op2=modifyOptional(op1);
		System.out.println(op2);
	}
	public static Optional<String> modifyOptional(Optional<String> opt1){
		if(opt1.isPresent()) {
			return Optional.ofNullable(opt1.get());
		}
		return Optional.ofNullable(null);
	}
}
//Optional.of()--> Doesnot accept null and throws Exception
//Optional.ofNullable()--> Accept null and doesnot throw Exception 