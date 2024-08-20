package com._2way;

import java.util.Arrays;

public class Student {
	String name;
	int number;
	public Student(String name,int number) {
		this.name=name;
		this.number=number;	
	}
	
@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + "]";
	}

public static void main(String[] args) {
int [] arr= {1,2,3,4};
for(int i=0;i<arr.length;i++) {
    System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("-----------------");

int i1=1,i2=2,i3=3;
int [] arr2= {i1,i2,i3};
for(int i=0;i<arr2.length;i++) {
    System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("-----------------");

Student s=new Student("Dhoni",1);
Student s1=new Student("Virat",2);
Student s2=new Student("rohit", 3);
Student [] students= {s,s1,s2};
for(int i=0;i<students.length;i++) { 
	System.out.println(students[i]);
}

 System.out.println(Arrays.toString(students));

}
}