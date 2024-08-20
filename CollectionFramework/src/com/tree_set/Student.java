package com.tree_set;

public class Student{
	private Integer id;
	private String name;
	private Double fees;
	public Student(Integer id,String name,Double fees){
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getFees() {
		return fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}


	
}