package com.task_13feb;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreObject {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		//creating file to store Object
		var fout=new FileOutputStream("F:\\downloadd\\CollectionFramework\\mcq's_9feb.txt");
		//object to store data //for writing operation
		var oos=new ObjectOutputStream(fout);
		try(fout;oos;sc){
		System.out.println("Enter Number of objects to create ");
		Integer noOfObject=sc.nextInt();
		for(int i=0;i<noOfObject;i++) {
			Student s=Student.getStudentObject();
			oos.writeObject(s);		//ObjectOutputStream
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Stored Successfully");
		
		
	}

}
