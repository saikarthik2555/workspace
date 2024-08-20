package com.senario_28feb;

public class Student{
	int stuId;
	String name;
	public Student(int stuId, String name) {
		super();
		this.stuId = stuId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentGradeBook [stuId=" + stuId + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stuId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stuId != other.stuId)
			return false;
		return true;
	}
	
}