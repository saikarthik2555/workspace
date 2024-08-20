package com.generic;
class NareshIT<T>
{
	private T test;
	
	public void set(T test)
	{
		this.test = test;
	}
	public T get()
	 {
		 return test;
	 }
}
public class GenericTest 
{
  public static void main(String[] args) 
  {
	  Student s=new Student(45, "Smith");
	 Student s1= s.get();
	 System.out.println(s1.toString());
   }
}
class Student{
	private int id;
	private String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Student get() {
		return new Student(id,name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}