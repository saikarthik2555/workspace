package com.optional_prg;

import java.util.Optional;

public record Employee(Integer id,String name) {
	
	public Optional<Integer> getId(){
		return Optional.ofNullable(id);
	}
	public Optional<String> getName(){
		return Optional.ofNullable(name);
	}
}
