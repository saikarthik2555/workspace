package com.prg.emp;

import java.util.Optional;

public record Employee(int id,String name) {
	
	public Optional<Integer> getId() {
		return Optional.ofNullable(id);
	}
	
	public Optional<String> getName(){
		return Optional.ofNullable(name);
	}

}
