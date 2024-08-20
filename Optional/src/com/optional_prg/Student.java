package com.optional_prg;

import java.util.Optional;

public class Student {
	private Integer id;
	private String name;
	public Student(Integer id,String name) {
		this.id=id;
		this.name=name;
	}
	public Optional<Integer> getId() {
		return Optional.ofNullable(id);
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
