package com.senario_28feb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeBook {
	public static void main(String[] args) {
		Map<Student,Character> s=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Grade Book");
		while(true) {
			System.out.println("Enter your choice");
			System.out.println("1. Add Student Grade");
			System.out.println("2. Remove Student Grade");
			System.out.println("3. Exit ");
			System.out.println("Enter the option ");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter Student roll no,name and grade");
				Integer id=sc.nextInt();
				String name=sc.nextLine();
				name=sc.nextLine();
				Student stu=new Student(id, name);
				Character grade=sc.next().charAt(0);
				s.put(stu, grade);
				if(s.containsKey(stu) && s.containsValue(grade)) {
					System.out.println("Added Successfully");
				}   break;
			case 2:
				System.out.println("Enter student details to delete from grade book");
			if(s.isEmpty()) {
				System.out.println("There are no students and grades to display");
			}else {
				System.out.println("input student id: ");
				Integer id1=sc.nextInt();
			//System.out.println(s.remove(id1));
				for(Student st:s.keySet())
				{
					if(id1==st.stuId) {
						Character remove = s.remove(st);
						System.out.println(remove);
					}
				}
			}
			break;
			case 3:  
				s.forEach((k,v)-> System.out.println("Student"+k+" Grade "+v));
				System.exit(0);
			default: System.out.println("Choice is Invalid , Enter valid input");
			}
		}
	}
}
