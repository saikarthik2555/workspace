package non_comparableobjs;

import java.util.TreeSet;

class Student {
	private Integer id;
	private String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



//	@Override
//	public int compareTo(Student stu) {
//		System.out.println("invoked");
//		return Integer.compare(stu.getId(), stu.getId());
//	}
	
}

public class DescendingInteger 
{
	public static void main(String[] args) 
	{
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student(11,"Z"));
		ts.add(new Student(34,"A"));
		ts.add(new Student(25,"B"));
		
//		Comparable<Student> cmp=new Comparable<Student>() {
//
//			@Override
//			public int compareTo(Student stu) {
//				
//				return Integer.compare(stu.getId(), stu.getId());
//			}
//			
//		};
		
		ts.forEach(str-> System.out.println(str));  
	}
}
