package com.prg.withoutoptional_lisat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListWithOptional {
	public static void main(String[] args) {
		List<Optional<String>> str=new ArrayList<Optional<String>>();	//java 9
	//	str.add();		//The method add(Optional<String>) in the type List<Optional<String>> is not applicable for the arguments ()
	
		str.add(Optional.of("today"));
		str.add(Optional.of("is"));
		str.add(Optional.of("tuesday"));
		str.add(Optional.ofNullable(null));
		
		for(Optional<String> s:str) {
			if(s.isPresent())
			System.out.println(s.get());
			else System.out.println("No value");
		}
		
	}

}
