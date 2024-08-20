package com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

record Employee(Integer id,String name) implements Serializable{
	public Employee getEmployeeObject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.nextLine();
		name=sc.nextLine();
		return new Employee(id, name);
		
	}
}
public class SerializableDemo1 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("F:\\downloadd\\Serializable\\EmployeeData.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		System.out.println("Enter the no. of employees want to store");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
			Employee e1=new Employee(100, "Default");
			Employee Obj=e1.getEmployeeObject();
			oos.writeObject(Obj);
		}
		
		
	}

}
