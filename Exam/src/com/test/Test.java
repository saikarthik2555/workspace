package com.test;

public class Test {
	public static void main(String[] args) {
		Student stu=new Student("Smith", 1, "Java");
		ScienceCollege si=new ScienceCollege(stu);
		si.CollegeDetails();
		si.getCollegeName();
		si.addStudent(stu);
		
	}

}
