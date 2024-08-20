package com.test;

public class ScienceCollege implements College{
	String name;
	int id;
	String course;
	

	public ScienceCollege(Student student) {
		super();
		this.name = student.name;
		this.id = student.id;
		this.course = student.course;
	}

	@Override
	public void getCollegeName() {
		// TODO Auto-generated method stub
		System.out.println("CBIT");
		
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		if(student.id>10) {
			System.out.println("Class is Full");
		}
		else {
			System.out.println("Added");
		}
		
	}

	@Override
	public void CollegeDetails() {
		// TODO Auto-generated method stub
		System.out.println("ScienceCollege [name=" + name + ", id=" + id + ", course=" + course + "]");
		
		
	}

	
}
