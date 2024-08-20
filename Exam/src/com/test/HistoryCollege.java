package com.test;

public class HistoryCollege implements College {
	String name;
	int id;
	String course;
	

	@Override
	public void getCollegeName() {
		// TODO Auto-generated method stub
		System.out.println("Osmania University");
		
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		if(student.id>10) {
			System.out.println("Class is Full");
		}
		else {
			System.out.println(" Added");
		}
		
	}
		
	@Override
	public void CollegeDetails() {
		// TODO Auto-generated method stub
		System.out.println("HistoryCollege [name=" + name + ", id=" + id + ", course=" + course + "]");
		
	}

	
	

}
