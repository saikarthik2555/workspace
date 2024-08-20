package com.optional_prg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListOfOptional {
	public static void main(String[] args) {
		List<Optional<String>> listOfOptional=new ArrayList<>();
		listOfOptional.add(Optional.of("Hyderabad"));
		listOfOptional.add(Optional.of("Secunderabad"));
		listOfOptional.add(Optional.of("Shanshabad"));
		listOfOptional.add(Optional.ofNullable(null));
		for(Optional<String> op: listOfOptional) {
			if(op.isPresent()) {
				System.out.println(op.get());		//get() from Optional
			}
			else {
				System.out.println("No value");
			}
		}
	}
}
